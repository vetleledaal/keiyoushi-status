# Extension Validation Report

- Extension: tachiyomi-ar.goonscans-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 32
- Lint: 1
- Warnings: 2
- Skipped: 1
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 2899371341317171497
- Source name: Goon Scans
- Source language: ar
- Selected manga input: popular offset 0: Daredemo Dakeru Kimi ga Suki (`.../daredemo-dakeru-kimi-ga-suki`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Daredemo Dakeru Kimi ga Suki (`.../daredemo-dakeru-kimi-ga-suki`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | The Witches of Adamas (`.../the-witches-of-adamas`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Paradise Hell (`.../paradise-hell`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | The City of Imprisoned Love (`.../the-city-of-imprisoned-love`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Daredemo Dakeru Kimi ga Suki (`.../daredemo-dakeru-kimi-ga-suki`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 45 | الفصل 1 (`.../daredemo-dakeru-kimi-ga-suki-%D8%A7%D9%84%D9%81%D8%B5%D9%84-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | SKIP | HTTP error 404 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Daredemo Dakeru Kimi ga Suki, URL=`.../daredemo-dakeru-kimi-ga-suki` at page 1 offset 0 and page 2 offset 19, title=Aki sora, URL=`.../aki-sora` at page 1 offset 1 and page 2 offset 20, title=Killer Beat, URL=`.../killer-beat` at page 1 offset 2 and page 2 offset 21, title=Zombie no Afureta Sekai Ore Dake ga Osowarenai, URL=`.../zombie-no-afureta-sekai-ore-dake-ga-osowarenai` at page 1 offset 3 and page 2 offset 22, title=The End in the Fall, URL=`.../the-end-in-the-fall` at page 1 offset 4 and page 2 offset 23 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://goonscans.org/.../20260517_180836-1-211x300.jpg` (image/jpeg, 22292 bytes, 211x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../daredemo-dakeru-kimi-ga-suki` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://goonscans.org/.../20260517_180836-1.jpg` (image/jpeg, 113643 bytes, 600x853) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | غوتو، طالب ثانوي بكر، يكن إعجابًا لزميلته المدرسة العصرية والمحبة، أغاوا. لكن في يوم بعد المدرسة، يضبط أغاوا وهي تمارس الجنس مع تاكاياما في فصل دراسي فارغ غوتو محطم القلب لكنه سرعان ما يكتشف أنها لم تمارس الجنس مع تاكاياما فقط، بل إن أغاوا عاهرة تمارس الجنس مع أي شخص يطلب منها. حتى….؟ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 45 chapters |  |  |  |
| chapter dates | PASS | 45 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://goonscans.org/.../01.webp` (image/webp (encoding: lossy), 179794 bytes, 1127x1600) |  |  |  |
