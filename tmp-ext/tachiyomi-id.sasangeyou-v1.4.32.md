# Extension Validation Report

- Extension: tachiyomi-id.sasangeyou-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1153502662292268302
- Source name: Sasangeyou
- Source language: id
- Selected manga input: latest offset 0: Otonatte, Choro~i (Original) Bahasa Indonesia (`.../otonatte-choroi-original-bahasa-indonesia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Saimin Seishidou (Original) Bahasa Indonesia (`.../saimin-seishidou-original-all-chapters-bahasa-indonesia`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Miboujin no Haha – Sayoko ~Yojouhan ni Sumu Oyako no Koubi Kiroku~ (Original) Bahasa Indonesia (`.../miboujin-no-haha-%E3%83%BBsayoko-yojouhan-ni-sumu-oyako-no-koubi-kiroku-original-bahasa-indonesia`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Otonatte, Choro~i (Original) Bahasa Indonesia (`.../otonatte-choroi-original-bahasa-indonesia`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | TS shita Ani ni Horete shimatta node Haramasete Kanzen ni Onna ni suru (Original) Bahasa Indonesia (`.../ts-shita-ani-ni-horete-shimatta-node-haramasete-kanzen-ni-onna-ni-suru-original-bahasa-indonesia`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Otonatte, Choro~i (Original) Bahasa Indonesia (`.../otonatte-choroi-original-bahasa-indonesia`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Otonatte, Choro~i (Original) Bahasa Indonesia (`.../otonatte-choroi-original-bahasa-indonesia`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 1 (`.../otonatte-choroi-original-bahasa-indonesia`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Otonatte, Choro~i (Original) Bahasa Indonesia, URL=`.../otonatte-choroi-original-bahasa-indonesia` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../Otonatte-Choro_1.jpg <redacted query values: resize>` (image/jpeg, 19290 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../otonatte-choroi-original-bahasa-indonesia` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../Otonatte-Choro_1.jpg` (image/jpeg, 164846 bytes, 1282x1793) |  |  |  |
| details author | PASS | Atelier Maso |  |  |  |
| details artist | PASS | doskoinpo |  |  |  |
| details genres | PASS | Anal, Bikini, Femdom, Footjob, Group, Humiliation, Loli, Original, Stocking, Teacher, Doujin |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Download dan Baca Doujin Bahasa Indonesia!!! Jangan lupa comment, bookmark, atau share ya. Doujin Detail: Source 320602 Pages 34 Pages Total Chapters 1 Chapter TUTORIAL: Tutorial Download Tutorial diblokir Follow Sosial Media sasangeyou agar tidak ketinggalan Info: Linktree Discord Dilihat: 375<br><br>Alternative Names: Adults are so Weak~ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.sasangeyouku.my.id/.../Otonatte-Choro_1.jpg.webp` (image/webp (encoding: lossy), 140268 bytes, 1282x1793) |  |  |  |
