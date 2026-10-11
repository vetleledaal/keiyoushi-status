# Extension Validation Report

- Extension: tachiyomi-en.hentaireadio-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1055804712296309124
- Source name: HentaiRead.io
- Source language: en
- Selected manga input: popular offset 0: 【NTR】Special Training Day at the Gym (`.../%E3%80%90ntr%E3%80%91special-training-day-at-the-gym-56603`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 37 | 【NTR】Special Training Day at the Gym (`.../%E3%80%90ntr%E3%80%91special-training-day-at-the-gym-56603`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 37 | Summer Zuma 3 (`.../summer-zuma-3-59598`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 37 | Madam - Manhwa (`.../madam-manhwa-5826`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 37 | Nurse Onee-san's Masochist Examination Test (`.../nurse-oneesan39;s-masochist-examination-test-60072`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | 【NTR】Special Training Day at the Gym (`.../%E3%80%90ntr%E3%80%91special-training-day-at-the-gym-56603`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 【NTR】Special Training Day at the Gym (`.../%E3%80%90ntr%E3%80%91special-training-day-at-the-gym-56603`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../chapter-1-154370`) |  | <1s |
| pages | `getPageList(chapter)` | success | 34 |  |  | <1s |

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
| popular listing | PASS | 37 entries |  |  |  |
| latest listing | PASS | 37 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=【NTR】Special Training Day at the Gym, URL=`.../%E3%80%90ntr%E3%80%91special-training-day-at-the-gym-56603` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 1 manga entry: title=【NTR】Special Training Day at the Gym, URL=`.../%E3%80%90ntr%E3%80%91special-training-day-at-the-gym-56603`; Popular page 2 repeats 1 manga entry: title=Summer Zuma 3, URL=`.../summer-zuma-3-59598`; Latest page 1 repeats 1 manga entry: title=Madam - Manhwa, URL=`.../madam-manhwa-5826`; Latest page 2 repeats 1 manga entry: title=Nurse Onee-san's Masochist Examination Test, URL=`.../nurse-oneesan39;s-masochist-examination-test-60072` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 150/150 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 150/150 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentairead.io/.../1775883735-69d9d5d762f28-cover.jpg` (image/jpeg, 70024 bytes, 250x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E3%80%90ntr%E3%80%91special-training-day-at-the-gym-56603` |  |  |  |
| details thumbnail URL | PASS | `https://hentairead.io/.../1775883735-69d9d5d762f28-cover.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hentai |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 34 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ht.mgread.io/.../1.jpg` (image/jpeg, 395624 bytes, 728x1125) |  |  |  |
