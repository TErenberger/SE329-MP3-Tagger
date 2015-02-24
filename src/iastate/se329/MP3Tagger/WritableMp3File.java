package iastate.se329.MP3Tagger;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

public class WritableMp3File extends Mp3File {

	public WritableMp3File() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WritableMp3File(String arg0) throws IOException,
			UnsupportedTagException, InvalidDataException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public WritableMp3File(File arg0) throws IOException,
			UnsupportedTagException, InvalidDataException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public WritableMp3File(String arg0, int arg1) throws IOException,
			UnsupportedTagException, InvalidDataException {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public WritableMp3File(String arg0, boolean arg1) throws IOException,
			UnsupportedTagException, InvalidDataException {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public WritableMp3File(File arg0, int arg1) throws IOException,
			UnsupportedTagException, InvalidDataException {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public WritableMp3File(String arg0, int arg1, boolean arg2)
			throws IOException, UnsupportedTagException, InvalidDataException {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}

	public WritableMp3File(File arg0, int arg1, boolean arg2)
			throws IOException, UnsupportedTagException, InvalidDataException {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}
	
	
	public String getPath(String pattern) throws TagException
	{
		//path cannot contain / \ : * ? " | < > 
		ID3v2 tag = this.getId3v2Tag();
		try
		{
			pattern = pattern.replaceAll("%A", tag.getArtist().trim());
			pattern = pattern.replaceAll("%a", tag.getAlbum().trim());
			pattern = pattern.replaceAll("%Y", tag.getYear().trim());
			pattern = pattern.replaceAll("%T", tag.getTitle().trim());
			pattern = pattern.replaceAll("%t", tag.getTrack().trim());
			
		}
		catch(Exception e)
		{
			throw new TagException();
		}
		pattern = pattern.replaceAll("[:/\\*?\"|<>]", "");
		return pattern;
	}
	

}
