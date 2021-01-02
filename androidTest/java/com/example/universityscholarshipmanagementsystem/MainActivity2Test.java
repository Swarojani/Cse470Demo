package com.example.universityscholarshipmanagementsystem;
import android.app.Activity;

import android.view.View;

import androidx.test.rule.ActivityTestRule;


import com.example.universityscholarshipmanagementsystem.controller.MainActivity2;
import com.example.universityscholarshipmanagementsystem.controller.datasave;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.*;

public class MainActivity2Test {

    @Rule
    public ActivityTestRule<MainActivity2> mActivityTestRule = new ActivityTestRule<MainActivity2>(MainActivity2.class);

    private MainActivity2 mActivity = null;


    @Before
    public void setUp() throws Exception {

        mActivity=mActivityTestRule.getActivity();

    }
    @Test
    public void testLaunch(){
       ;
        View view=mActivity.findViewById(R.id.textView);

        assertNotNull(view);
    }



    @After
    public void tearDown() throws Exception {
        mActivity=null;
    }
}