# Extension Validation Report

- Extension: tachiyomi-en.azuki-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8195282477201261072
- Source name: Omoi
- Source language: en
- Selected manga input: popular offset 0: A Livid Lady's Guide to Getting Even: How I Crushed My Homeland with My Mighty Grimoires (`.../a-livid-ladys-guide-to-getting-even-how-i-crushed-my-homeland-with-my-mighty-grimoires`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | A Livid Lady's Guide to Getting Even: How I Crushed My Homeland with My Mighty Grimoires (`.../a-livid-ladys-guide-to-getting-even-how-i-crushed-my-homeland-with-my-mighty-grimoires`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | How I Met My Soulmate (`.../how-i-met-my-soulmate`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Gizmo Riser (`.../gizmo-riser`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Bomba! (`.../bomba`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | A Livid Lady's Guide to Getting Even: How I Crushed My Homeland with My Mighty Grimoires (`.../a-livid-ladys-guide-to-getting-even-how-i-crushed-my-homeland-with-my-mighty-grimoires`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | A Livid Lady's Guide to Getting Even: How I Crushed My Homeland with My Mighty Grimoires (`.../a-livid-ladys-guide-to-getting-even-how-i-crushed-my-homeland-with-my-mighty-grimoires`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 51 | Chapter 1 (`.../1d01f451-d87c-4647-a9c8-8cdc3d149caa`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Livid Lady's Guide to Getting Even: How I Crushed My Homeland with My Mighty Grimoires, URL=`a-livid-ladys-guide-to-getting-even-how-i-crushed-my-homeland-with-my-mighty-grimoires#21956b38-7e69-4d67-9780-86a590411fa4` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://production.image.azuki.co/.../800_2-3.jpg` (image/jpeg, 210315 bytes, 800x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `a-livid-ladys-guide-to-getting-even-how-i-crushed-my-homeland-with-my-mighty-grimoires#21956b38-7e69-4d67-9780-86a590411fa4` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://production.image.azuki.co/.../2400_2-3.webp` (image/webp (encoding: lossy), 639894 bytes, 2400x3600) |  |  |  |
| details author | PASS | Hagure metabo, Oonoimo, masami |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Shonen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Elizabeth Leiston, the daughter of Haldoria’s powerful prime minister, is the picture of a refined noble lady and the perfect future queen. <br><br>But when her fiancé publicly humiliates her, calls off their engagement, and starts spreading nasty rumors about her, Elizabeth reaches her breaking point. Why should her only friend be her loyal maid, and why should she continue to serve a country that doesn’t respect her? Elizabeth concludes she won't stand it any longer and will bring down the kingdom, even if it's the last thing she does! <br><br>As such, she uses her quick wit and, more importantly, her seven magic grimoires to embark on a quest for revenge. And let her tell you, there will be hell to pay!<br><br>A Livid Lady's Guide to Getting Even: How I Crushed My Homeland with My Mighty Grimoires (Manga) Vol. 1-2<br>Translated by Rymane Tsouria<br>Edited by Mario Mendez<br>Lettered by Giuseppe Anteppe Fusco<br><br>Alternative Titles:<br>Buchigire Reijou wa Houfuku wo Chikaimashita. ~Madousho no Chikara de Sokoku wo Tataki Tsubushimasu~<br>ブチ切れ令嬢は報復を誓いました。 ～魔導書の力で祖国を叩き潰します～<br><br>New chapters every Wednesday at 8 am PST! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 51 chapters |  |  |  |
| chapter dates | PASS | 51 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://production.image-content.azuki.co/.../1600.webp <redacted query values: drm>` (image/webp (encoding: lossy), 379178 bytes, 1600x2275) |  |  |  |
