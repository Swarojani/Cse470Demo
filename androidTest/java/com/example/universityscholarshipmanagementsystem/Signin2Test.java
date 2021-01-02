package com.example.universityscholarshipmanagementsystem;
import android.view.View;
import android.app.Activity;

import androidx.test.rule.ActivityTestRule;

import com.example.universityscholarshipmanagementsystem.R;
import com.example.universityscholarshipmanagementsystem.controller.Signin2;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class Signin2Test {

    @Rule
    public ActivityTestRule<Signin2> mActivityTestRule = new ActivityTestRule<Signin2>(Signin2.class);

    private Signin2 mActivity = null;


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