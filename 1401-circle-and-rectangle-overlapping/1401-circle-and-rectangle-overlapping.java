class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter,
                                int x1, int y1, int x2, int y2) {

        // Find the closest x-coordinate on the rectangle
        int closestX = Math.max(x1, Math.min(xCenter, x2));

        // Find the closest y-coordinate on the rectangle
        int closestY = Math.max(y1, Math.min(yCenter, y2));

        // Distance between circle center and closest point
        long dx = (long) xCenter - closestX;
        long dy = (long) yCenter - closestY;

        // If distance <= radius, they overlap
        return dx * dx + dy * dy <= (long) radius * radius;
    }
}