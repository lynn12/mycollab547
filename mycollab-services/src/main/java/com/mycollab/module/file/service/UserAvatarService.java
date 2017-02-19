/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.file.service;

import com.mycollab.db.persistence.service.IService;

import java.awt.image.BufferedImage;

/**
 * User avatar service which is responsible of uploading and getting avatar
 *
 * @author MyCollab Ltd.
 * @since 1.0
 */
public interface UserAvatarService extends IService {
    /**
     * @param username
     * @return
     */
    String uploadDefaultAvatar(String username);

    /**
     * Upload user avatar
     *
     * @param image    current user avatar
     * @param username username
     * @param avatarId avatar id which usually be generated by MyCollab as a random
     *                 stream to avoid overlap or caching old avatar of system.
     * @return
     */
    String uploadAvatar(BufferedImage image, String username, String avatarId);

    /**
     * @param avatarId
     */
    void removeAvatar(String avatarId);
}
