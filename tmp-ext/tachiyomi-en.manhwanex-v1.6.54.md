# Extension Validation Report

- Extension: tachiyomi-en.manhwanex-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3663840686576348637
- Source name: ManhwaNex
- Source language: en
- Selected manga input: popular offset 0: A Glimpse of the Jianghu (`.../244`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | A Glimpse of the Jianghu (`.../244`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Postman of the Apocalypse (`.../256`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Overlord of Insects (`.../539`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Global Beast Tamer: I Can See the Path of Evolution (`.../618`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | A Glimpse of the Jianghu (`.../244`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Glimpse of the Jianghu (`.../244`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 19 | Chapter 0 - Entering the Martial World (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 4 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Glimpse of the Jianghu, URL=`244` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwanex.com/.../ChatGPT-Image-Feb-14-2026-06_43_22-PM-350x476.png` (image/png, 289061 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `244` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manhwanex.com/.../ChatGPT-Image-Feb-14-2026-06_43_22-PM-193x278.png` (image/png, 107753 bytes, 193x278) |  |  |  |
| details author | PASS | Snap Studio (三原社) |  |  |  |
| details artist | PASS | Snap Studio (三原社) |  |  |  |
| details genres | PASS | Action, A Glimpse of Jianghu webtoon, A Glimpse of the Jianghu manga, Adventure supernatural manga, Asian martial world series, Jianghu story manga, Martial arts fantasy manga, 江湖一瞥 manga, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A Glimpse of the Jianghu Manhua is a thrilling action-packed manhua that places readers in the heart of a mysterious martial arts world, commonly known as the jianghu — a place where strength, skill, reputation, and honor define life and death.<br><br>The story follows the journey of an ordinary individual who enters this world unexpectedly and becomes immersed in its complex power struggles, secret sects, and hidden techniques. Unlike conventional fantasy settings, the world of Jianghu is governed not just by strength, but by strategy, alliances, and a deep understanding of martial arts philosophies.<br><br>Throughout the series, the protagonist faces formidable opponents and intricate situations that test his resolve, skill, and moral compass. The balance between personal growth and external conflicts creates a narrative that is both emotionally engaging and action-driven, appealing to readers who enjoy immersive world-building and martial arts progression.<br><br>In the world of A Glimpse of the Jianghu, martial arts cultivators roam the lands, each belonging to different schools or factions, each with unique techniques and codes of honor. The Jianghu world operates on its own rules, where reputation holds weight, and small decisions often carry big consequences.<br><br>The protagonist must navigate this world wisely, forming alliances when beneficial and confronting rival factions when necessary. As the story progresses, the depth of the world’s history, the philosophies of martial arts, and the complexity of human relationships are revealed.<br><br>The main character starts as an unremarkable individual, yet his determination to survive and improve gradually earns him respect in the Jianghu world. His growth is not sudden or inexplicable — it is driven by training, learning from experience, and adapting to challenges.<br><br>Unlike typical protagonists who gain power instantly, this character’s progression feels earned and organic, making his evolution engaging and believable for readers who value character depth and strategic growth.<br><br>This manhua stands out for its:<br><br>Unique martial arts world setting with philosophical depth<br><br>Strategic growth rather than quick power explosions<br><br>Immersive action sequences and evolving plot<br><br>Thought-provoking character relationships and alliances<br><br>Readers who love action, adventure, and martial arts narratives with emotional depth will find A Glimpse of the Jianghu captivating and refreshingly different from ordinary fantasy stories.<br><br>The world is deeply rooted in martial arts philosophy rather than typical fantasy mechanics.<br><br>Protagonist growth emphasizes learning, experience, and adaptability.<br><br>Complex factions and sects make political and strategic plots engaging.<br><br>Relationships and rivalries are not simplistic — they evolve and influence the protagonist’s path.<br><br>Action – Exciting combat sequences and tactical fighting Martial Arts – Philosophy, techniques, schools, and traditions Fantasy – A world with unique systems and mystical elements Adventure – New challenges and paths explored Drama – Emotional stakes and character evolution<br><br>Q: Is A Glimpse of the Jianghu ongoing? A: Yes, the manhua is currently ongoing with regular updates.<br><br>Q: What type of readers will enjoy it? A: Fans of classic martial arts worlds, full-action storytelling, strategic character growth, and immersive world-building will enjoy this title.<br><br>Q: Is this based on a novel? A: The manhua incorporates themes commonly found in wuxia and martial arts novels, focusing on philosophy, fight systems, and factions.<br><br>The protagonist’s interactions with allies and rivals shape his journey in the Jianghu world. Friendships are tested, rivalries push growth, and alliances influence key turning points in the story.<br><br>The combat system in this world doesn’t rely on sudden strength boosts. Mastery comes from training, understanding techniques, and strategic use of skills. Each sect and faction has its own specialties, and learning from them is part of the protagonist’s evolution.<br><br>Arc 1 – Entering the Jianghu: Introduction to martial arts world and initial struggles. Arc 2 – Training & Conflict: Skill growth, rival encounters, and internal challenges. Arc 3 – Power Struggles: Higher stakes and faction politics influence the journey.<br><br>Also known by its Chinese title 江湖一瞥.<br><br>Alternative Names: A Glimpse of the Jianghu manga, Jianghu Glimpse webtoon, 江湖一瞥, Glimpse of Jianghu series, A Glimpse of the Martial World |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 19 chapters |  |  |  |
| chapter dates | LINT | 2 of 19 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.manhwanex.com/.../imgi_2_01-68.jpg` (image/jpeg, 2373942 bytes, 800x14170) |  |  |  |
