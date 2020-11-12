package com.example.aidlservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import aidlpkg.MyAIDL;

public class MyService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return ibinder;
    }
    MyAIDL.Stub ibinder = new MyAIDL.Stub() {
        @Override
        public int add(int i, int j) throws RemoteException {
            return i+j;
        }
    };
}