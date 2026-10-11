# Extension Validation Report

- Extension: tachiyomi-ar.dilar-v1.6.18
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7634600808243438399
- Source name: Dilar
- Source language: ar
- Selected manga input: popular offset 0: A Portrait of Pride (`.../A%20Portrait%20of%20Pride`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | A Portrait of Pride (`.../A%20Portrait%20of%20Pride`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 21 | Loyalty to Maria (`.../Loyalty%20to%20Maria`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 19 | The Students of Illip Arts High (`.../The%20Students%20of%20Illip%20Arts%20High`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Portrait of Pride (`.../A%20Portrait%20of%20Pride`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Portrait of Pride (`.../A%20Portrait%20of%20Pride`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 17 | 0 - المقدمة (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalStateException: Unsupported encryption protocol version: 16 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalStateException: Unsupported encryption protocol version: 16 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 21 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Portrait of Pride, URL=`13528/A Portrait of Pride` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dilar.tube/.../large_gothic_rosebound_lovers.webp` (image/webp (encoding: lossy), 77012 bytes, 353x535) |  |  |  |
| details identity | PASS | Details preserved selected URL `13528/A Portrait of Pride` |  |  |  |
| details thumbnail URL | PASS | `https://dilar.tube/.../large_gothic_rosebound_lovers.webp` |  |  |  |
| details author | PASS | Dalseul |  |  |  |
| details artist | PASS | Hot Fuzzy Comics |  |  |  |
| details genres | PASS | رومانسي, دراما, مانهوا, فانتازيا, تاريخي, جوسي, غموض |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | تُجبر ديانا -وهي خادمة كفيفة تخفي ماضيها بحذر شديد- على التجسس على ولي العهد بأمر من الأمير آيزن. كانت تتوقع أن تجد رجلًا معتزلًا وعليل الصحة يقضي أيامه في الرسم وحيدًا، لكن الرجل الذي التقت به كان مختلفًا تمامًا عما رددته الشائعات. فهل ستنجو من المخاطر التي تتربص بها في قصره؟ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Unsupported encryption protocol version: 16 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
