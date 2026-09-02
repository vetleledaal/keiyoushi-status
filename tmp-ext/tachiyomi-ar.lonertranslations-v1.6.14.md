# Extension Validation Report

- Extension: tachiyomi-ar.lonertranslations-v1.6.14
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 323105186892383931
- Source name: Loner Translations
- Source language: ar
- Selected manga input: popular offset 0: My Dearest Self With Malice Aforethought (`.../my-dearest-self-with-malice-aforethought.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 3 | My Dearest Self With Malice Aforethought (`.../my-dearest-self-with-malice-aforethought.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 3 | My Dearest Self With Malice Aforethought (`.../my-dearest-self-with-malice-aforethought.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | My Dearest Self With Malice Aforethought (`.../my-dearest-self-with-malice-aforethought.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Dearest Self With Malice Aforethought (`.../my-dearest-self-with-malice-aforethought.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 98 | الفصل 01 (`.../my-dearest-self-with-malice-chapter-1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 70 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 3 entries |  |  |  |
| latest listing | PASS | 3 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Dearest Self With Malice Aforethought, URL=`.../my-dearest-self-with-malice-aforethought.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 7/7 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 7/7 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../MyDearestSelfwithMaliceAforethought-c001%28v01%29-p000%5BCover%5D%5Bdig%5D%5BKodanshaComics%5D%5Bdanke-Empire%5D%7BHQ%7D_copy_1125x1600.jpg` (image/jpeg, 13301 bytes, 141x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-dearest-self-with-malice-aforethought.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../MyDearestSelfwithMaliceAforethought-c001%28v01%29-p000%5BCover%5D%5Bdig%5D%5BKodanshaComics%5D%5Bdanke-Empire%5D%7BHQ%7D_copy_1125x1600.jpg` (image/jpeg, 131597 bytes, 600x853) |  |  |  |
| details author | PASS | INORYUU Hajime |  |  |  |
| details artist | PASS | ITOU Shouta |  |  |  |
| details genres | PASS | إثارة, بالغ, دراما, رعب, سينين, غموض, نفسي |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | إيجي، طالب جامعي، يحلم بأن يحصل على خليلة يومًا ما... حتى يستيقظ ذات يوم مع "خليلته" في سريره معه! ليس هذا وحسب، بل أخبره صديقه بأنّه قد دخل في شجار... وأنّ ثلاثة أيام مرّت ولم يتذكّرها إيجي؟ ما هي الأسرار المُظلمة التي يُخفيها... إيجي نفسه؟<br><br>أسماء أخرى: أسماء أخرى: Shinai naru Boku e Satsui wo Komete, The Killer Inside, 親愛なる僕へ殺意をこめて |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 98 chapters |  |  |  |
| chapter dates | PASS | 98 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 70 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../MDSWMA-1-00.jpg` (image/jpeg, 121677 bytes, 1125x1600) |  |  |  |
