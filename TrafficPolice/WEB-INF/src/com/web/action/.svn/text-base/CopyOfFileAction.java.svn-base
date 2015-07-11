package com.web.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONObject;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.annotations.JSON;

import com.web.action.base.BaseAction;

public class CopyOfFileAction extends BaseAction
{

	/**
     * 
     */
	private static final long serialVersionUID = 1L;
	private File image; // 上传的文件
	private String imageFileName; // 文件名
	private String imageContentType; // 文件类型
	private String action;
	private String key;
	private String filename;

	// myFile属性用来封装上传的文件
	private File upload;
	private String uploadFileName;
	private String message;
	private String uploadContentType;

	public String getUploadContentType()
	{
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType)
	{
		this.uploadContentType = uploadContentType;
	}

	public File getUpload()
	{
		return upload;
	}

	public void setUpload(File upload)
	{
		this.upload = upload;
	}

	public String getUploadFileName()
	{
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName)
	{
		this.uploadFileName = uploadFileName;
	}

	// myFileContentType属性用来封装上传文件的类型
	private String myFileContentType;

	// 上传
	public String advertisement()
	{
		String realpath = ServletActionContext.getServletContext().getRealPath(
				"style");
		log.debug("#####文件上传...### image is " + image + "## is null ? "
				+ (image != null) + " ### File Type is " + imageContentType);
		String type = imageFileName.substring(imageFileName.lastIndexOf('.'));
		if (!".jpg".equals(type.toLowerCase()))
		{
			message = "广告图片必须为jpg格式";
			action = "admin/page/Startpage.jsp";
			return SUCCESS;
		}
		if (image != null)
		{
			File dir = new File(realpath);
			try
			{
				File savefile = new File(dir, filename + ".jpg");
				if (!savefile.getParentFile().exists())
					savefile.getParentFile().mkdirs();

				FileUtils.copyFile(image, savefile);
				message = "文件上传成功";
			} catch (Exception e)
			{
				log.error("FILE UPLOAD##: ERROR####", e);
				message = "文件上传失败###" + e.getLocalizedMessage();
			}
		}
		action = "admin/page/Startpage.jsp";
		return SUCCESS;
	}

	// 图片上传

	@JSON(serialize = false)
	public String editUpload_json() throws IOException
	{

		// 文件保存目录路径
		String savePath = ServletActionContext.getServletContext().getRealPath(
				"admin/page/upload");

		// 文件保存目录URL
		String saveUrl = getRequest().getContextPath() + "/admin/page/upload/";
		// String saveUrl = "/upload/";
		String fileExt = imageFileName
				.substring(imageFileName.lastIndexOf('.'));
		PrintWriter out = null;
		JSONObject obj = new JSONObject();
		this.getResponse().setCharacterEncoding("GBK");
		try
		{
			if (image != null)
			{
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
				Date tmp = new Date();
				String ymd = sdf.format(tmp);
				savePath += "/" + ymd + "/";
				saveUrl += "/" + ymd + "/";
				File dirFile = new File(savePath);
				if (!dirFile.exists())
				{
					dirFile.mkdirs();
				}
				String newFileName = tmp.getTime() + fileExt;
				File savefile = new File(dirFile, newFileName);
				if (!savefile.getParentFile().exists())
					savefile.getParentFile().mkdirs();

				FileUtils.copyFile(image, savefile);
				message = "文件上传成功";
				out = getOutputStream();

				obj.put("error", 0);
				obj.put("url", "upload" + "/" + ymd + "/" + newFileName);

			} else
			{
				log.debug("### image is null! ###");
				obj.put("error", 1);
				obj.put("message", getError("上传文件失败。"));
			}
		} catch (Exception e)
		{
			log.error(getError("上传文件失败。"), e);
			obj.put("error", 1);
			obj.put("message", getError("上传文件失败。"));
		} finally
		{
			if (null != getOutputStream())
			{
				out.println(obj.toString());
				out.flush();
				out.close();
			}
		}
		return SUCCESS;
	}

	// 文件上传
	@JSON(serialize = false)
	public String fileUpload() throws IOException
	{

		ServletContext context = ServletActionContext.getServletContext();
		JSONObject obj = new JSONObject();
		PrintWriter out = null;
		HttpServletResponse response = getResponse();
		try
		{
			if (upload != null)
			{
				// 基于myFile创建一个文件输入流
				InputStream is = new FileInputStream(upload);
				// 设置上传文件目录
				String uploadPath = ServletActionContext.getServletContext()
						.getRealPath("/page/admin/document/");
				// 文件存放路径
				String filePath = getRequest().getContextPath()
						+ "/page/admin/document/";
				String fileExt = uploadFileName.substring(uploadFileName
						.lastIndexOf('.'));
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
				Date tmp = new Date();
				String realName = tmp.getTime() + fileExt;
				// 设置目标文件
				File toFile = new File(uploadPath, realName);
				// 创建一个输出流
				OutputStream os = new FileOutputStream(toFile);
				// 设置缓存
				byte[] buffer = new byte[1024];

				int length = 0;

				// 读取myFile文件输出到toFile文件中
				while ((length = is.read(buffer)) > 0)
				{
					os.write(buffer, 0, length);
				}
				// 关闭输入流
				is.close();
				// 关闭输出流
				os.close();
				response.setHeader("Cache-Control", "no-cache");
				response.setContentType("text/html;charset=utf-8");
				out = getOutputStream();

				obj.put("success", true);
				obj.put("message", "上传成功");
				obj.put("url", filePath + realName);
				// obj.put("error", 0);
			} else
			{
				log.debug("### image is null! ###");
				obj.put("error", 1);
				obj.put("message", getError("上传文件失败。"));
			}
		} catch (Exception e)
		{
			log.error(getError("上传文件失败。"), e);
			obj.put("error", 1);
			obj.put("message", getError("上传文件失败。"));
		} finally
		{
			if (null != getOutputStream())
			{
				out.println(obj);
				out.flush();
				out.close();
			}
		}

		return SUCCESS;
	}

	@JSON(serialize = false)
	public String errorInputEditImage() throws IOException
	{
		JSONObject obj = new JSONObject();
		this.getResponse().setCharacterEncoding("GBK");
		obj.put("error", 1);
		obj.put("message", "上传的文件过大，或不是一个合法的图片文件!\\n\\t"
				+ "1.允许上传的文件大小最大不得超过200K\\n\\t" + "2.文件格式必须为jpg格式" + "\\n\\t"
				+ getError("上传文件失败。"));
		PrintWriter out = getOutputStream();
		out.println(obj.toString());
		out.flush();
		out.close();
		return null;
	}

	public String errorInputAdvertisement()
	{
		message = "上传的文件过大，或不是一个合法的图片文件!\\n\\t" + "1.允许上传的文件大小最大不得超过200K\\n\\t"
				+ "2.文件格式必须为jpg格式";
		action = "admin/page/Startpage.jsp";
		return SUCCESS;
	}

	private String getError(String message)
	{
		JSONObject obj = new JSONObject();
		obj.put("error", 1);
		obj.put("message", message);
		return obj.toString();
	}

	public File getImage()
	{
		return image;
	}

	public void setImage(File image)
	{
		this.image = image;
	}

	public String getImageFileName()
	{
		return imageFileName;
	}

	public void setImageFileName(String imageFileName)
	{
		this.imageFileName = imageFileName;
	}

	public String getImageContentType()
	{
		return imageContentType;
	}

	public void setImageContentType(String imageContentType)
	{
		this.imageContentType = imageContentType;
	}

	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}

	public String getKey()
	{
		return key;
	}

	public void setKey(String key)
	{
		this.key = key;
	}

	public String getFilename()
	{
		return filename;
	}

	public void setFilename(String filename)
	{
		this.filename = filename;
	}

	public String getMyFileContentType()
	{
		return myFileContentType;
	}

	public void setMyFileContentType(String myFileContentType)
	{
		this.myFileContentType = myFileContentType;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

}
