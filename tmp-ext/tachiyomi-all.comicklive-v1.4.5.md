# Extension Validation Report

- Extension: tachiyomi-all.comicklive-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 4
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 4972933717624256217
- Source name: Comick (Unoriginal)
- Source language: en
- Selected manga input: latest offset 0: Isekai Munchkin - HP 1 no Mama de Saikyou Saisoku Dungeon Kouryaku (`.../isekai-munchkin-hp-1-no-mama-de-saikyou-saisoku-dungeon-kouryaku`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | Your Mom Is the Best (`.../your-mom-is-the-best`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | Your Mom Is the Best (`.../your-mom-is-the-best`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 100 | Isekai Munchkin - HP 1 no Mama de Saikyou Saisoku Dungeon Kouryaku (`.../isekai-munchkin-hp-1-no-mama-de-saikyou-saisoku-dungeon-kouryaku`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 100 | Isekai Munchkin - HP 1 no Mama de Saikyou Saisoku Dungeon Kouryaku (`.../isekai-munchkin-hp-1-no-mama-de-saikyou-saisoku-dungeon-kouryaku`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 10s+ |
| details | `fetchMangaDetails(manga)` | success | 1 | Isekai Munchkin - HP 1 no Mama de Saikyou Saisoku Dungeon Kouryaku (`.../isekai-munchkin-hp-1-no-mama-de-saikyou-saisoku-dungeon-kouryaku`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 60 | Ch. 1 (`.../J8wUejB-chapter-1-en`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 49 |  |  | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | SKIP | Covered by popular and latest pagination failures |  |  |  |
| manga title and URL | PASS | 300/300 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 300/300 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn1.comicknew.pictures/.../ec809bee.webp` (image/webp (encoding: lossy), 60586 bytes, 460x633) |  |  |  |
| details identity | PASS | Details preserved selected URL `isekai-munchkin-hp-1-no-mama-de-saikyou-saisoku-dungeon-kouryaku` |  |  |  |
| details thumbnail URL | PASS | `https://cdn1.comicknew.pictures/.../ec809bee.webp` |  |  |  |
| details author | PASS | Yuu shimizu, aogiri makoto |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Content Rating: Suggestive, Adventure, Drama, Comedy, Action, Ecchi, Romance, Fantasy, Isekai |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Isekai Munchkin - HP 1 no Mama de Saikyou Saisoku Dungeon Kouryaku summary: 異世界マンチキン ーＨＰ１のままで最強最速ダンジョン攻略ー / Otherworldly Munchkin: Let's Speedrun the Dungeon with Only 1 HP! / HP 1인채로 최강최속 던전공략 / 异世界玩家用HP1 进行最强最快的迷宫攻略 / Юный попаданец остаётся на том же уровне 16-year-old Yukito Kirihara lives with his 14-year-old sister Sana, whom he treasures more than anyone else.<br><br>But when an ogre shows up outside of his window looking for Sana (a shocking event in its own right), Yukito leaps to save her—and is killed.<br><br>He's offered the promise of reincarnation by a mysterious woman, who gives him a character sheet in a mysterious book.<br><br>But when Yukito sees Sana in there, too, he sets off to find her, and save them both—even if he only has 1 hp with which to do it! ___ Alternative English Translation (INKR)<br><br> Alternative Titles: <br>- Isekai Munchkin: HP 1 no Mama de Saikyou Saisoku Dungeon Kouryaku<br>- 異世界マンチキン ーＨＰ１のままで最強最速ダンジョン攻略ー, Otherworldly Munchkin |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 60 chapters |  |  |  |
| chapter dates | PASS | 60 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 49 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://cdn1.comicknew.pictures/.../0.jpeg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 429 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
