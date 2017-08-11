package nl.crashdata.chartjs.data.simple;

import nl.crashdata.chartjs.data.ChartJsHoverConfig;
import nl.crashdata.chartjs.data.ChartJsInteractionMode;

public class SimpleChartJsHoverConfig implements ChartJsHoverConfig
{
	private static final long serialVersionUID = 1L;

	private ChartJsInteractionMode mode;

	private boolean intersect;

	@Override
	public ChartJsInteractionMode getMode()
	{
		return mode;
	}

	public void setMode(ChartJsInteractionMode mode)
	{
		this.mode = mode;
	}

	@Override
	public boolean isIntersect()
	{
		return intersect;
	}

	public void setIntersect(boolean intersect)
	{
		this.intersect = intersect;
	}
}
