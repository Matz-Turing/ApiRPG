package mono.com.google.android.gms.maps.model;


public class FeatureLayer_OnFeatureClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.model.FeatureLayer.OnFeatureClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFeatureClick:(Lcom/google/android/gms/maps/model/FeatureClickEvent;)V:GetOnFeatureClick_Lcom_google_android_gms_maps_model_FeatureClickEvent_Handler:Android.Gms.Maps.Model.FeatureLayer/IOnFeatureClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.Model.FeatureLayer+IOnFeatureClickListenerImplementor, Xamarin.GooglePlayServices.Maps", FeatureLayer_OnFeatureClickListenerImplementor.class, __md_methods);
	}

	public FeatureLayer_OnFeatureClickListenerImplementor ()
	{
		super ();
		if (getClass () == FeatureLayer_OnFeatureClickListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Gms.Maps.Model.FeatureLayer+IOnFeatureClickListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
		}
	}

	public void onFeatureClick (com.google.android.gms.maps.model.FeatureClickEvent p0)
	{
		n_onFeatureClick (p0);
	}

	private native void n_onFeatureClick (com.google.android.gms.maps.model.FeatureClickEvent p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
