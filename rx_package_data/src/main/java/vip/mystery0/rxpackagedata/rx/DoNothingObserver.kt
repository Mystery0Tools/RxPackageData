package vip.mystery0.rxpackagedata.rx

import android.util.Log

class DoNothingObserver<T>(private val isLog: Boolean = false) : RxObserver<T>() {
	companion object {
		private const val TAG = "DoNothingObserver"
	}

	override fun onFinish(data: T?) {
		if (isLog)
			Log.i(TAG, "onFinish: $data")
	}

	override fun onError(e: Throwable) {
		if (isLog)
			Log.e(TAG, "onError: ", e)
	}
}