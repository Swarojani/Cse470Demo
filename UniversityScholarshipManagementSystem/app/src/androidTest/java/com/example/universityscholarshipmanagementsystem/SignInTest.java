package com.example.universityscholarshipmanagementsystem;
import android.view.View;

import androidx.test.rule.ActivityTestRule;

import com.example.universityscholarshipmanagementsystem.R;
import com.example.universityscholarshipmanagementsystem.controller.SignIn;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class SignInTest {

    @Rule
    public ActivityTestRule<SignIn> mActivityTestRule = new ActivityTestRule<SignIn>(SignIn.class);

    private SignIn mActivity = null;


    @Before
    public void setUp() throws Exception {

        mActivity=mActivityTestRule.getActivity();

    }
    @Test
    public void testLaunch(){
        View view=mActivity.findViewById(R.id.textView);

        assertNotNull(view);
    }



    @After
    public void tearDown() throws Exception {
        mActivity=null;
    }
}