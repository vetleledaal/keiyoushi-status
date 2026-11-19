# Extension Validation Report

- Extension: tachiyomi-en.streamexunoriginal-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4588902933476711975
- Source name: StreameX (unoriginal)
- Source language: en
- Selected manga input: popular offset 0: Chainsaw Man (`.../105778`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Chainsaw Man (`.../105778`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Tokyo Revengers (`.../102988`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Chainsaw Man (`.../105778`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Chainsaw Man (`.../105778`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 232 | Chapter 1 (`.../105778 <redacted query values: chapterId>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 58 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chainsaw Man, URL=`105778` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 44/44 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 44/44 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.anilist.co/.../bx105778-euxXZEIfDY2u.png` (image/png, 609084 bytes, 460x722) |  |  |  |
| details identity | PASS | Details preserved selected URL `105778` |  |  |  |
| details thumbnail URL | PASS | `https://s4.anilist.co/.../bx105778-euxXZEIfDY2u.png` |  |  |  |
| details author | PASS | Tatsuki Fujimoto |  |  |  |
| details artist | PASS | Tatsuki Fujimoto |  |  |  |
| details genres | PASS | Action, Comedy, Drama, Horror, Supernatural |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | The name says it all! Denji's life of poverty is changed forever when he merges with his pet chainsaw dog, Pochita! Now he's living in the big city and an official Devil Hunter. But he's got a lot to learn about his new job and chainsaw powers!<br><br>(Source: MANGA Plus)<br><br>Notes:<br>\- Nominated for the 2020 Manga Taisho Award.<br>\- Winner of the 2021 Kono Manga ga Sugoi Award.<br>\- Winner of the 66th Shogakukan Manga Award in the shounen category.<br>\- Winner of the 2021 and 2022 Harvey Award for Best Manga.<br>\- Chapters 1-97 were released in Weekly Shounen Jump from Dec 3, 2018 to Dec 13, 2020. The series resumed from Ch. 98 in Shounen Jump+ on July 12, 2022<br><br>**Format:** Manga<br><br>**Alternative Names:**<br>- チェンソーマン |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 232 chapters |  |  |  |
| chapter dates | LINT | All 232 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=232 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 58 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://streamex.hn/.../popular <redacted query values: page>` to `https://www.streamex.hn/.../popular <redacted query values: page>` (1 redirects); popular: `https://streamex.hn/.../search <redacted query values: query and page>` to `https://www.streamex.hn/.../search <redacted query values: query and page>` (1 redirects); popular: `https://streamex.hn/.../105778` to `https://www.streamex.hn/.../105778` (1 redirects); popular: `https://streamex.hn/.../popular <redacted query values: page>` to `https://www.streamex.hn/.../popular <redacted query values: page>` (1 redirects); popular: `https://streamex.hn/.../chapters <redacted query values: id>` to `https://www.streamex.hn/.../chapters <redacted query values: id>` (1 redirects); popular: `https://streamex.hn/.../pages <redacted query values: chapterId>` to `https://www.streamex.hn/.../pages <redacted query values: chapterId>` (1 redirects); popular: `https://streamex.hn/.../manga-image <redacted query values: url>` to `https://www.streamex.hn/.../manga-image <redacted query values: url>` (1 redirects) |  |  |  |
| page load | PASS | `https://streamex.hn/.../manga-image <redacted query values: url>` (image/jpeg, 325083 bytes, 1067x1600) |  |  |  |
