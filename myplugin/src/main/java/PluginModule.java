import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo (name="whoareyou")
public class PluginModule extends AbstractMojo {
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("I'm a plugin module!");
    }
}
