# Extension Validation Report

- Extension: tachiyomi-en.mangamob-v1.4.3
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
- Source implementation: keiyoushi.source.Generated
- Source ID: 954997815643613941
- Source name: Comivex
- Source language: en
- Selected manga input: latest offset 0: Call of the Spear (`.../1980-call-of-the-spear-mg1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | The Hero Returns (`.../3616-the-hero-returns`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Black Haze (2025) (`.../6906-black-haze-2025`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 68 | Call of the Spear (`.../1980-call-of-the-spear-mg1`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Call of the Spear (`.../1980-call-of-the-spear-mg1`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Call of the Spear (`.../1980-call-of-the-spear-mg1`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 254 | Chapter 1 (`.../1-eng-li`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 56 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 68 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Call of the Spear, URL=`.../1980-call-of-the-spear-mg1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 117/117 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 117/117 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://imgsrv5.com/.../call-of-the-spear-mg1.jpg` (image/jpeg, 26200 bytes, 157x211) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1980-call-of-the-spear-mg1` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://imgsrv5.com/.../call-of-the-spear-mg1.jpg` (image/jpeg, 72326 bytes, 288x412) |  |  |  |
| details author | PASS | Updating |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | San-gun, the owner of the mountain, was reborn as a tiger and became a spiritual creature. A girl visits San-gun, who lived in peace, and says she will serve him. San-gun tries to drive her out, but she has nowhere to go back. San-gun finally decided to take back the girl. And there are countless threats to him |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 254 chapters |  |  |  |
| chapter dates | PASS | 254 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://imgsrv5.com/.../01.jpg` (image/jpeg, 149238 bytes, 720x961) |  |  |  |
