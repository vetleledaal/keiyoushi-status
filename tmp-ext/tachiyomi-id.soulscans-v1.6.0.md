# Extension Validation Report

- Extension: tachiyomi-id.soulscans-v1.6.0
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8061354444776372735
- Source name: Soul Scans
- Source language: id
- Selected manga input: popular offset 0: My Simulated Path to Immortality (`.../my-simulated-path-to-immortality`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | My Simulated Path to Immortality (`.../my-simulated-path-to-immortality`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Legend of the Emperor (`.../legend-of-the-emperor`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | A Painter Who Draws Dungeons (`.../a-painter-who-draws-dungeons`) |  | 10s+ |
| latest_next | `getLatestUpdates(2)` | success | 20 | Kakushite Kisetsu wa Ao wo Shiru (`.../kakushite-kisetsu-wa-ao-wo-shiru`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Simulated Path to Immortality (`.../my-simulated-path-to-immortality`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 78 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 33 |  |  | 10s+ |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.soulscans.org/.../cover-49c89273-76a9-11f1-8e7d-5cba2c768088-28f4e3bd-2762-4692-92bb-c5a0eb59e0dc.jpg` (image/jpeg, 157032 bytes, 800x1611) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-simulated-path-to-immortality` |  |  |  |
| details thumbnail URL | PASS | `https://img.soulscans.org/.../cover-49c89273-76a9-11f1-8e7d-5cba2c768088-28f4e3bd-2762-4692-92bb-c5a0eb59e0dc.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Jalan menuju keabadian memang luar biasa sulit! Terlebih lagi di dunia kultivasi yang telah sepenuhnya berubah karena wabah mematikan! Manusia biasa membawa penyakit itu, dan bila seorang kultivator bersentuhan dengannya, paling ringan kekuatan kultivasinya akan melemah, dan paling parah, ia harus mengembalikan Dao-nya kepada langit. Karena itu, manusia fana dan para abadi kini terpisah selamanya. Baca hanya di Soulscans.my.id Aku bereinkarnasi ke dunia ini dengan penuh ambisi besar, namun hanya bisa berjuang di antara para manusia fana, menyia-nyiakan hidupku begitu saja. Beruntung, di saat-saat terakhir menjelang kematian, aku membangkitkan sebuah harta misterius—harta yang mampu mengubah kenyataan menjadi ilusi, menjadikan kehidupanku yang nyata tak lebih dari mimpi sesaat, dan memberiku kesempatan untuk kembali ke saat pertama kali aku tiba! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 78 chapters |  |  |  |
| chapter dates | PASS | 78 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `http://sscdn.dbm.my.id/.../00-1.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 522 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
