import unittest
def find_rectangular_overlap(r1, r2):
    """returns a dictionary containing the coordinates of the intersection of two rects"""

    left_x = max(r1['left_x'], r2['left_x'])
    right_x = min(r1['left_x'] + r1['width'], r2['left_x'] + r2['width'])
    width = right_x - left_x

    lower_y = max(r1['bottom_y'], r2['bottom_y'])
    upper_y = min(r1['bottom_y'] + r1['height'], r2['bottom_y'] + r2['height'])
    height = upper_y - lower_y
    intersection1={
        'left_x': None,
        'bottom_y': None,
        'width': None,
        'height': None}

    if width <= 0 or height <= 0:
        return intersection1

    intersection = {
        'left_x': left_x,
        'bottom_y': lower_y,
        'width': width,
        'height': height
    }

    return intersection
