package tests;

import org.junit.Test;

import renderer.ImageWriter;
import renderer.Render;
import scene.Scene;
import scene.SceneBuilder;

public class SceneFactoryTest {

	@Test
	public void sceneFactoryTest(){
		
		SceneBuilder sceneFactory = new SceneBuilder("1-01_sphere" + ".xml");
		
		ImageWriter IW = sceneFactory.getImageWriter();
		Scene scene = sceneFactory.getScene();
		
		Render render = new Render(IW, scene);
		
		render.renderImage();
		render.printGrid(50);
		render.writeToImage();
		
	}
	
}
