# Extension Validation Report

- Extension: tachiyomi-id.pramramadhan-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 637793516114361627
- Source name: Pramramadhan
- Source language: id
- Selected manga input: latest offset 0: Osananajimi omiru me ga kawatte shimatta (`.../osananajimi-omiru-me-ga-kawatte-shimatta`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 17 | Momogusa-san ga Monogusa Sugiru!! (`.../momogusa-san`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 17 | Osananajimi omiru me ga kawatte shimatta (`.../osananajimi-omiru-me-ga-kawatte-shimatta`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Osananajimi omiru me ga kawatte shimatta (`.../osananajimi-omiru-me-ga-kawatte-shimatta`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Osananajimi omiru me ga kawatte shimatta (`.../osananajimi-omiru-me-ga-kawatte-shimatta`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 3 | Chapter 1 (`.../1.00`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 17 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Osananajimi omiru me ga kawatte shimatta, URL=`.../osananajimi-omiru-me-ga-kawatte-shimatta` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 35/35 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 35/35 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://01.pramramadhan.my.id/.../cover_1778628202.png` (image/png, 2177170 bytes, 1280x1920) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../osananajimi-omiru-me-ga-kawatte-shimatta` |  |  |  |
| details thumbnail URL | PASS | `https://01.pramramadhan.my.id/.../cover_1778628202.png` |  |  |  |
| details author | PASS | Komekura |  |  |  |
| details artist | PASS | Komekura |  |  |  |
| details genres | PASS | Romance, School, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Sampai baru-baru ini, mereka seharusnya hanya sekadar teman masa kecil… tapi begitu mereka mulai menyadari keberadaan satu sama lain, tak ada jalan untuk kembali. Sebuah komedi romantis remaja tentang titik balik itu! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://01.pramramadhan.my.id/.../001.webp <redacted query values: v>` (image/webp (encoding: lossy), 208728 bytes, 1706x2560) |  |  |  |
