# Extension Validation Report

- Extension: tachiyomi-all.mangadex-v1.4.212
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 25
- Lint: 0
- Warnings: 1
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: eu.kanade.tachiyomi.extension.all.mangadex.MangaDex
- Source ID: 2499283573021220255
- Source name: MangaDex
- Source language: en
- Selected manga input: popular offset 0: Solo Leveling (`.../32d76d19-8a05-4db0-9fc2-e0b0648fe9d0`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Solo Leveling (`.../32d76d19-8a05-4db0-9fc2-e0b0648fe9d0`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Jujutsu Kaisen (`.../c52b2ce3-7f95-469c-96b0-479524fb7a1a`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 67 | This is How You Play a Villainess (`.../db9efe7c-6e4b-4a48-8613-2104d304e2c2`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 74 | Puniru is a Kawaii Slime (`.../b66e8da4-f2f3-4159-8db8-e523094be8c2`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 7 | Solo Leveling (`.../32d76d19-8a05-4db0-9fc2-e0b0648fe9d0`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Solo Leveling (`.../32d76d19-8a05-4db0-9fc2-e0b0648fe9d0`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 0 |  |  | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 67 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Solo Leveling, URL=`.../32d76d19-8a05-4db0-9fc2-e0b0648fe9d0` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Animal Beastman, URL=`.../6a50e29f-c157-45b7-9192-99010527301e` at page 1 offset 14 and page 2 offset 28, title=We're Newlyweds but I Still Can’t Sleep With Her, because she's the Team Captain, URL=`.../51f96647-89e6-430a-a96a-f45e72543f8c` at page 1 offset 18 and page 2 offset 38, title=Mochida is Falling in Love, URL=`.../1c51c9e4-ee7c-492b-9e7f-3e5adc2a9ebb` at page 1 offset 20 and page 2 offset 46, title=My Black Mage Is Too Cute!, URL=`.../dbecff9d-1870-4532-9961-7ff885aeeea9` at page 1 offset 21 and page 2 offset 48, title=Hiiragi-chan & Tomikawa-chan, URL=`.../494868d1-f9d9-405d-82c6-8bb8cfdc3980` at page 1 offset 33 and page 2 offset 2 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 188/188 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 188/188 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://uploads.mangadex.org/.../e90bdc47-c8b9-4df7-b2c0-17641b645ee1.jpg` (image/jpeg, 317676 bytes, 800x1080) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../32d76d19-8a05-4db0-9fc2-e0b0648fe9d0` |  |  |  |
| details thumbnail URL | PASS | `https://uploads.mangadex.org/.../e90bdc47-c8b9-4df7-b2c0-17641b645ee1.jpg` |  |  |  |
| details author | PASS | h-goon (현군), Chugong (추공), Gi So-Ryeong (기소령) |  |  |  |
| details artist | PASS | REDICE Studio (레드아이스 스튜디오), Jang Sung-Rak (장성락) |  |  |  |
| details genres | PASS | Adaptation, Award Winning, Full Color, Long Strip, Web Comic, Action, Adventure, Drama, Fantasy, Magic, Monsters, Supernatural, Korean |  |  |  |
| details status | PASS | PUBLISHING_FINISHED (4) |  |  |  |
| details description | PASS | 10 years ago, after “the Gate” that connected the real world with the monster world opened, some of the ordinary, everyday people received the power to hunt monsters within the Gate. They are known as “Hunters”. However, not all Hunters are powerful. My name is Sung Jin-Woo, an E-rank Hunter. I’m someone who has to risk his life in the lowliest of dungeons, the “World’s Weakest”. Having no skills whatsoever to display, I barely earned the required money by fighting in low-leveled dungeons… at least until I found a hidden dungeon with the hardest difficulty within the D-rank dungeons! In the end, as I was accepting death, I suddenly received a strange power, a quest log that only I could see, a secret to leveling up that only I know about! If I trained in accordance with my quests and hunted monsters, my level would rise. Changing from the weakest Hunter to the strongest S-rank Hunter!<br><br>Final chapter:<br>Vol.3 Ch.200 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
