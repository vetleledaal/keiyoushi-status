# Extension Validation Report

- Extension: tachiyomi-all.v2ph-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
- Lint: 1
- Warnings: 0
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4511819378822109646
- Source name: V2PH
- Source language: all
- Selected manga input: popular offset 0: Selected Street Style Photos – Exquisite Nude-Colored Stockings and High Heels (`.../amo89e8a.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 16 | Selected Street Style Photos – Exquisite Nude-Colored Stockings and High Heels (`.../amo89e8a.html`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 16 | Yu Feng Street Photography – Spy Killing Storm – Exquisite Female Spy in Stockings: The Truth Revealed (Photos + Video) (`.../z4mxo6na.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Yuzuha Saeki - Ambiguity is Fine (`.../zo7x35ez.html`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Selected Street Style Photos – Exquisite Nude-Colored Stockings and High Heels (`.../amo89e8a.html`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Selected Street Style Photos – Exquisite Nude-Colored Stockings and High Heels (`.../amo89e8a.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Gallery (`.../amo89e8a.html`) |  | <1s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: V2PH Session expired. Please log in via WebView to view more than 20 images. | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: V2PH Session expired. Please log in via WebView to view more than 20 images. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Selected Street Style Photos – Exquisite Nude-Colored Stockings and High Heels, URL=`.../amo89e8a.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 45/45 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 45/45 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.v2ph.com/.../qs0ZtUPHgIg1ZpaA.jpg` (image/jpeg, 96706 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../amo89e8a.html` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Street Snap |  |  |  |
| details artist | PASS | Anonymous |  |  |  |
| details genres | PASS | Quality, Street style, Beautiful Bust, sexy, Quality, lovely, Pure, sweet, Quality, Fresh, Japanese, sunlight, Outdoor beauty, Beautiful Bust, Quality, Lingerie, Sexy girl, Boudoir, Quality, Tits, Lingerie, F Cup |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Photos: 125 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | V2PH Session expired. Please log in via WebView to view more than 20 images. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
