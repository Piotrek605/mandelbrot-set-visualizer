import javax.swing.JPanel;
import java.awt.BorderLayout;

public class MandelbrotComponent extends JPanel
{
	private static final long serialVersionUID = 9182670711379108664L;

	public MandelbrotComponent(MandelbrotSet set)
	{
		super();

		MandelbrotModel model = new MandelbrotModel(set);
		MandelbrotView view = new MandelbrotView(model);

		model.addObserver(view);

		setLayout(new BorderLayout());
		add(view, BorderLayout.CENTER);
	}
}