# Extension Validation Report

- Extension: tachiyomi-id.komikcast-v1.6.83
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 972717448578983812
- Source name: VoraToon
- Source language: id
- Selected manga input: popular offset 0: My God Level Super Watch (`.../my-god-level-super-watch`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | My God Level Super Watch (`.../my-god-level-super-watch`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | The Day I Started Fanboying for the Girl I Used to Dislike (`.../the-day-i-started-fanboying-for-the-girl-i-used-to-dislike`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Monopolizing All Opportunities (`.../monopolizing-all-opportunities`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Leu Leu Leu (`.../leu-leu-leu`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | My God Level Super Watch (`.../my-god-level-super-watch`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My God Level Super Watch (`.../my-god-level-super-watch`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 18 | Chapter 0 (`.../0`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My God Level Super Watch, URL=`.../my-god-level-super-watch` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cvr.voratoon.id/.../cover-my-god-level-super-watch.webp <redacted query values: X-Amz-Algorithm, X-Amz-Content-Sha256, X-Amz-Credential, X-Amz-Date, X-Amz-Expires, X-Amz-Signature, X-Amz-SignedHeaders, x-amz-checksum-mode, and x-id>` (image/webp (encoding: lossy), 22616 bytes, 194x259) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-god-level-super-watch` |  |  |  |
| details thumbnail URL | PASS | `https://cvr.voratoon.id/.../cover-my-god-level-super-watch.webp <redacted query values: X-Amz-Algorithm, X-Amz-Content-Sha256, X-Amz-Credential, X-Amz-Date, X-Amz-Expires, X-Amz-Signature, X-Amz-SignedHeaders, x-amz-checksum-mode, and x-id>` |  |  |  |
| details author | PASS | Màn kè wénhuà |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Fantasy, School Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kehidupan Jintian yang antusias dari masa remajanya telah berulang kali mengalami kemalangan, ia menuduh Tuhan, secara tidak sengaja mengubah arloji biasa menjadi arloji super masa depan, meramalkan bahwa masa depan akan tetap bugar! Tapi rahasia apa yang tersembunyi di jam tangan super ini!? Mari kita lihat bagaimana anak muda yang sulit dipaksa mengubah keadaan dan membalikkan kehidupan! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 18 chapters |  |  |  |
| chapter dates | PASS | 18 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.voratoon.com/.../001.jpg` (image/jpeg, 156162 bytes, 800x1133) |  |  |  |
