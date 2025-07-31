package com.github.e2318501.doorlock.listener;

import lombok.RequiredArgsConstructor;
import com.github.e2318501.doorlock.DoorLock;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

@RequiredArgsConstructor
public class BlockListener implements Listener {
    private final DoorLock plugin;

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        plugin.getLockManager().deleteLock(event.getBlock());
    }
}
