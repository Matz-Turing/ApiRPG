package mono.com.google.android.gms.maps;


public class GoogleMap_OnMapCapabilitiesChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnMapCapabilitiesChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMapCapabilitiesChanged:(Lcom/google/android/gms/maps/model/MapCapabilities;)V:GetOnMapCapabilitiesChanged_Lcom_google_android_gms_maps_model_MapCapabilities_Handler:Android.Gms.Maps.GoogleMap/IOnMapCapabilitiesChangedListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.GoogleMap+IOnMapCapabilitiesChangedListenerImplementor, Xamarin.GooglePlayServices.Maps", GoogleMap_OnMapCapabilitiesChangedListenerImplementor.class, __md_methods);
	}

	public GoogleMap_OnMapCapabilitiesChangedListenerImplementor ()
	{
		super ();
		if (getClass () == GoogleMap_OnMapCapabilitiesChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Gms.Maps.GoogleMap+IOnMapCapabilitiesChangedListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
		}
	}

	public void onMapCapabilitiesChanged (com.google.android.gms.maps.model.MapCapabilities p0)
	{
		n_onMapCapabilitiesChanged (p0);
	}

	private native void n_onMapCapabilitiesChanged (com.google.android.gms.maps.model.MapCapabilities p0);

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
