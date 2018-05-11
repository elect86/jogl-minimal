package tpietzsch.blockmath3;

public class SubArrays
{
	public static void copysubarray3d(
			final short[] src,
			final int sox,
			final int soy,
			final int soz,
			final int ssx,
			final int ssy,
			final short[] dst,
			final int dox,
			final int doy,
			final int doz,
			final int dsx,
			final int dsy,
			final int csx,
			final int csy,
			final int csz )
	{
		for ( int z = 0; z < csz; ++z )
			copysubarray2d( src, sox, soy + soz * ssy + z * ssy, ssx, dst, dox, doy + doz * dsy + z * dsy, dsx, csx, csy );
	}

	public static void copysubarray2d(
			final short[] src,
			final int sox,
			final int soy,
			final int ssx,
			final short[] dst,
			final int dox,
			final int doy,
			final int dsx,
			final int csx,
			final int csy )
	{
		for ( int y = 0; y < csy; ++y )
			copysubarray1d( src, sox + soy * ssx + y * ssx, dst, dox + doy * dsx + y * dsx, csx );
	}

	public static void copysubarray1d(
			final short[] src,
			final int sox,
			final short[] dst,
			final int dox,
			final int csx )
	{
		for ( int x = 0; x < csx; ++x )
			dst[ dox + x ] = src[ sox + x ];
	}

	public static void fillsubarray3d(
			final short src,
			final short[] dst,
			final int dox,
			final int doy,
			final int doz,
			final int dsx,
			final int dsy,
			final int csx,
			final int csy,
			final int csz )
	{
		for ( int z = 0; z < csz; ++z )
			fillsubarray2d( src, dst, dox, doy + doz * dsy + z * dsy, dsx, csx, csy );
	}

	public static void fillsubarray2d(
			final short src,
			final short[] dst,
			final int dox,
			final int doy,
			final int dsx,
			final int csx,
			final int csy )
	{
		for ( int y = 0; y < csy; ++y )
			fillsubarray1d( src, dst, dox + doy * dsx + y * dsx, csx );
	}

	public static void fillsubarray1d(
			final short src,
			final short[] dst,
			final int dox,
			final int csx )
	{
		for ( int x = 0; x < csx; ++x )
			dst[ dox + x ] = src;
	}
}