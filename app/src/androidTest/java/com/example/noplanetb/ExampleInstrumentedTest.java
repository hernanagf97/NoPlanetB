package com.example.noplanetb;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<BLogin> {
    Button boton_siguiente;

    public ExampleInstrumentedTest() {
        super(BLogin.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        BLogin actividad = getActivity();

        boton_siguiente = actividad.findViewById(R.id.boton_siguiente);
    }

    public void testName() {
        TouchUtils.tapView(this, boton_siguiente);
    }
}
