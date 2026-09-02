# Extension Validation Report

- Extension: tachiyomi-id.okyykomik-v1.6.16
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 1
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8361715798247396418
- Source name: OkyyKomik
- Source language: id
- Selected manga input: popular offset 0: Kill the Male Lead to Become the Villainess (`.../kill-male-lead-to-become-villainess.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Kill the Male Lead to Become the Villainess (`.../kill-male-lead-to-become-villainess.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kill the Male Lead to Become the Villainess (`.../kill-male-lead-to-become-villainess.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kill the Male Lead to Become the Villainess (`.../kill-male-lead-to-become-villainess.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 37 | Kill the Male Lead to Become the Villainess Chapter 01 (`.../kill-male-lead-to-become-villainess_7.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 44 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kill the Male Lead to Become the Villainess, URL=`.../kill-male-lead-to-become-villainess.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../00.jpg` (image/jpeg, 137690 bytes, 600x861) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kill-male-lead-to-become-villainess.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../00.jpg` (image/jpeg, 51709 bytes, 340x488) |  |  |  |
| details author | PASS | Shisi Xia Xiang (十四夏乡) |  |  |  |
| details artist | PASS | Shisi Xia Xiang (十四夏乡) |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Setelah membunuh pemeran utama pria, gadis yang awalnya tidak bersalah berubah menjadi penjahat. Saat dia hendak menikmati kebebasan barunya, dia meninggal dengan kejam dan kembali ke awal permainan. Setelah membawa semua keterampilan yang dia peroleh dalam "permainan" sebelumnya, dia bersiap untuk membunuh pemeran utama pria lagi; Namun, keadaan saat ini tampak agak... aneh? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 37 chapters |  |  |  |
| chapter dates | PASS | 37 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 44 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../00.jpg` (image/webp (container: extended), 231490 bytes, 1115x1600) |  |  |  |
