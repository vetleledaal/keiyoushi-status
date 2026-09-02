# Extension Validation Report

- Extension: tachiyomi-all.webtoons-v1.4.57
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 2522335540328470744
- Source name: Webtoons.com
- Source language: en
- Selected manga input: popular offset 0: Who Made Me a Princess (`.../list <redacted query values: title_no>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Who Made Me a Princess (`.../list <redacted query values: title_no>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Tears on a Withered Flower (`.../list <redacted query values: title_no>`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 150 | Unnie, I Like You! (`.../list <redacted query values: title_no>`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | Who Made Me a Princess (`.../list <redacted query values: title_no>`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Who Made Me a Princess (`.../list <redacted query values: title_no>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 28 | Episode 1 (ch. 1) (`.../viewer <redacted query values: title_no and episode_no>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 33 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 150 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Who Made Me a Princess, URL=`.../list <redacted query values: title_no>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=The Beloved Incompetent Stepmom, URL=`.../list <redacted query values: title_no>` at page 1 offset 11 and page 2 offset 27, title=Change Your Story, URL=`.../list <redacted query values: title_no>` at page 1 offset 13 and page 2 offset 10 |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 230/230 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 230/230 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://webtoon-phinf.pstatic.net/.../0Thumb_Poster_9475.jpg <redacted query values: type>` (image/jpeg, 124855 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../list <redacted query values: title_no>` |  |  |  |
| details thumbnail URL | PASS | `https://webtoon-phinf.pstatic.net/.../0Thumb_Poster_9475.jpg <redacted query values: type>` |  |  |  |
| details author | PASS | Spoon , Plutus |  |  |  |
| details artist | PASS | Spoon , Plutus |  |  |  |
| details genres | PASS | Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A modern-day woman awakens reborn as Athanasia, the doomed princess of a novel she knows by heart, destined to be executed by her own father, Emperor Claude. Determined to survive, she plans to live unnoticed and escape before her fate can unfold. But when she encounters the ruthless emperor years earlier than the story dictates, her careful plans begin to unravel. Trapped inside a narrative that already knows her ending, Athanasia must rewrite her destiny before history repeats itself. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 28 chapters |  |  |  |
| chapter dates | PASS | 28 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://webtoon-phinf.pstatic.net/.../17726474065173149_Who_Made_Me_a_Princess_Episode_1_0001.jpg <redacted query values: type>` (image/jpeg, 25805 bytes, 800x1280) |  |  |  |
