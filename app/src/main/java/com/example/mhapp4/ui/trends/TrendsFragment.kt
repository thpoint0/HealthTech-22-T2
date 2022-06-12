package com.example.mhapp4.ui.trends

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mhapp4.ThirdActivity
import com.example.mhapp4.databinding.FragmentTrendsBinding


class TrendsFragment : Fragment() {

private var _binding: FragmentTrendsBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val notificationsViewModel =
            ViewModelProvider(this).get(TrendsViewModel::class.java)

    _binding = FragmentTrendsBinding.inflate(inflater, container, false)
    val root: View = binding.root

    val textView: TextView = binding.textTrends
    notificationsViewModel.text.observe(viewLifecycleOwner) {
      textView.text = it
    }

      val intent = Intent(activity, ThirdActivity::class.java)
      startActivity(intent)

    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}