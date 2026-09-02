# Extension Validation Report

- Extension: tachiyomi-all.mangapluscreators-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 4994699950662723787
- Source name: MANGA Plus Creators by SHUEISHA
- Source language: en
- Selected manga input: latest offset 0: Distinct but chaotic love (`.../052607220005230027438368`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Sense Life (`.../w72209030242155470024268456`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Distinct but chaotic love (`.../052607220005230027438368`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Cake Up (`.../mo2605011857590025529777`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Distinct but chaotic love (`.../052607220005230027438368`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Distinct but chaotic love (`.../052607220005230027438368`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 9 | #001 (`.../h82607220005230027438368`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 8 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Distinct but chaotic love, URL=`.../052607220005230027438368` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 91/91 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 91/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://assets.mangaplus-creators.jp/.../thumb_91100111.jpg <redacted query values: h>` (image/jpeg, 130920 bytes, 640x854) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../052607220005230027438368` |  |  |  |
| details thumbnail URL | PASS | `https://assets.mangaplus-creators.jp/.../thumb_91100111.jpg <redacted query values: h>` |  |  |  |
| details author | PASS | Riyan |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Satou is just an ordinary high school student who wants to live a peaceful life, but things quickly become complicated when he meets Hana, a quiet girl with a wolf cut and a personality that hides more than she shows. With his mischievous best friend Haruto constantly teasing and interfering, Satou finds himself caught in a series of awkward situations, misunderstandings, and unexpected moments with Hana. A chaotic yet wholesome school romantic comedy about two teenagers slowly discovering feelings they never expected. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://assets.mangaplus-creators.jp/.../s_91100075.jpg <redacted query values: h>` (image/jpeg, 246924 bytes, 1280x1707) |  |  |  |
