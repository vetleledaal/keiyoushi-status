# Extension Validation Report

- Extension: tachiyomi-en.emaqi-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3383118804501081522
- Source name: emaqi
- Source language: en
- Selected manga input: popular offset 0: Anjo the Mischievous Gal (`.../6763d1bb-0d5e-4c6d-a634-a82db649c0c1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Anjo the Mischievous Gal (`.../6763d1bb-0d5e-4c6d-a634-a82db649c0c1`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 40 | GALAXIAS (`.../bc5b1f05-1ecb-476d-b513-a306ce36cd0d`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | The Revenge Widow (`.../9f0c5062-20bb-4c91-bc6f-bc6d2102b4f4`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Anjo the Mischievous Gal (`.../6763d1bb-0d5e-4c6d-a634-a82db649c0c1`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Anjo the Mischievous Gal (`.../6763d1bb-0d5e-4c6d-a634-a82db649c0c1`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 135 | 🔒 (Preview) Vol. 1 (`.../vol-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 87 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Anjo the Mischievous Gal, URL=`6763d1bb-0d5e-4c6d-a634-a82db649c0c1#anjo-the-mischievous-gal` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 91/91 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 91/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://r.emaqi.com/.../877765a7-407c-4cd0-a1bf-642ac1edeba4.jpg` (image/png, 1190811 bytes, 853x1200; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `6763d1bb-0d5e-4c6d-a634-a82db649c0c1#anjo-the-mischievous-gal` |  |  |  |
| details thumbnail URL | PASS | `https://r.emaqi.com/.../877765a7-407c-4cd0-a1bf-642ac1edeba4.jpg` |  |  |  |
| details author | PASS | Yuichi Kato |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Rom-Com, School / Academy, Heart-fluttering, Funny, Healing, Only on emaqi, Awards & Nominations, 2010s |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Seto, a studious but unremarkable student, constantly finds himself in provocative situations with Anjo, the popular girl in his class who can't seem to stop teasing him. A heart-pounding teen rom-com bursting with youthful passion!<br><br>Publisher: SHONENGAHOSHA CO., LTD.<br><br>Age limit: 16+ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 135 chapters |  |  |  |
| chapter dates | PASS | 135 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 87 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://pr.emaqi.com/.../4739a585-d487-4983-9eb6-5c0b71bbf1e9 <redacted query values: Expires, KeyName, and Signature>` (image/jpeg, 6499 bytes, 853x1200; server Content-Type: application/octet-stream) |  |  |  |
