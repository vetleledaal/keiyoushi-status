# Extension Validation Report

- Extension: tachiyomi-id.soulscans-v1.6.6
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: loneseal
- Source ID: 8061354444776372735
- Source name: Soul Scans
- Source language: id
- Selected manga input: popular offset 0: My Simulated Path to Immortality (`.../my-simulated-path-to-immortality`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | My Simulated Path to Immortality (`.../my-simulated-path-to-immortality`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | I’m Trapped in This Day for One Thousand Years (`.../im-trapped-in-this-day-for-one-thousand-years`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 240 | The Investor Who Sees The Future (`.../the-investor-who-sees-the-future`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | My Simulated Path to Immortality (`.../my-simulated-path-to-immortality`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Simulated Path to Immortality (`.../my-simulated-path-to-immortality`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 92 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 33 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 240 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Simulated Path to Immortality, URL=`.../my-simulated-path-to-immortality` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 281/281 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 274/281 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.soulscans.asia/.../cover-49c89273-76a9-11f1-8e7d-5cba2c768088-a55988f5-d43b-4dd8-ac85-4b0886ea6d75.webp` (image/webp (encoding: lossy), 387988 bytes, 1280x1957) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-simulated-path-to-immortality` |  |  |  |
| details thumbnail URL | PASS | `https://img.soulscans.asia/.../cover-49c89273-76a9-11f1-8e7d-5cba2c768088-a55988f5-d43b-4dd8-ac85-4b0886ea6d75.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Jalan menuju keabadian memang luar biasa sulit! Terlebih lagi di dunia kultivasi yang telah sepenuhnya berubah karena wabah mematikan! Manusia biasa membawa penyakit itu, dan bila seorang kultivator bersentuhan dengannya, paling ringan kekuatan kultivasinya akan melemah, dan paling parah, ia harus mengembalikan Dao-nya kepada langit. Karena itu, manusia fana dan para abadi kini terpisah selamanya. Baca hanya di Soulscans.my.id Aku bereinkarnasi ke dunia ini dengan penuh ambisi besar, namun hanya bisa berjuang di antara para manusia fana, menyia-nyiakan hidupku begitu saja. Beruntung, di saat-saat terakhir menjelang kematian, aku membangkitkan sebuah harta misterius—harta yang mampu mengubah kenyataan menjadi ilusi, menjadikan kehidupanku yang nyata tak lebih dari mimpi sesaat, dan memberiku kesempatan untuk kembali ke saat pertama kali aku tiba! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 92 chapters |  |  |  |
| chapter dates | PASS | 92 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `http://sscdn.dbm.my.id/.../00-1.webp` to `https://sscdn.dbm.my.id/.../00-1.webp` (1 redirects) |  |  |  |
| page load | PASS | `http://sscdn.dbm.my.id/.../00-1.webp` (image/webp (container: extended), 126764 bytes, 800x624) |  |  |  |
