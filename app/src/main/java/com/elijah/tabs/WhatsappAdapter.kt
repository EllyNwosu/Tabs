package com.elijah.tabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.elijah.tabs.view.CallFragment
import com.elijah.tabs.view.ChatsFragment
import com.elijah.tabs.view.StatusFragment

class WhatsappAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> return "Chats"
            1 -> return "Status"
            2 -> return "Call"
            else -> return "Chats"
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> return ChatsFragment()
            1 -> return StatusFragment()
            2 -> return CallFragment()
            else -> return ChatsFragment()
        }
    }
}