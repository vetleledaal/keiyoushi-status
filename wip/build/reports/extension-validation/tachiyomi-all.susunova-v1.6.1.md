# Extension Validation Report

- Extension: tachiyomi-all.susunova-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7992964878104442620
- Source name: Susunova
- Source language: all
- Selected manga input: popular offset 0: Yang Energy (`.../yang-energy-manga-korean-ef4xy`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Yang Energy (`.../yang-energy-manga-korean-ef4xy`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Nebula (`.../nebula-manga-korean-rcwpw`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Stuck in my sister's dating sim (`.../stuck-in-my-sisters-dating-sim-manga-indonesia-whklv`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Pick me,love me (`.../pick-melove-me-manga-indonesia-q8rde`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Yang Energy (`.../yang-energy-manga-korean-ef4xy`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Yang Energy (`.../yang-energy-manga-korean-ef4xy`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 26 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yang Energy, URL=`.../yang-energy-manga-korean-ef4xy` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://susunova.xyz/.../VoxJZWnRTgKhDep2JfvXa5QV1x6Qmu9ikfOtROiY.jpg` (image/png, 190343 bytes, 300x400; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../yang-energy-manga-korean-ef4xy` |  |  |  |
| details thumbnail URL | PASS | `https://susunova.xyz/.../VoxJZWnRTgKhDep2JfvXa5QV1x6Qmu9ikfOtROiY.jpg` |  |  |  |
| details author | PASS | Susoong |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Yaoi, Smut, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lee Shinhui sudah terbiasa melakukan berbagai pekerjaan serabutan demi menghidupi adiknya yang sedang sakit. Namun, ketika ia secara tidak sengaja memecahkan sebuah kelereng misterius, ia justru terseret ke dunia iblis! Saat harapannya untuk bertahan hidup hampir sirna, ia diselamatkan oleh seorang dokkaebi kuat bernama Ohwi, yang menuntut qi jiwa Shinhui untuk memuaskan rasa laparnya sendiri. Terjebak di dunia berbahaya dan terikat pada keinginan Ohwi, bisakah Shinhui menemukan jalan untuk kembali ke rumah, atau ia ditakdirkan menjadi wadah qi jiwa pribadi Ohwi untuk selamanya?<br><br>**Alternative Names:**<br>- Goblin Bride, The Dokkaebi's Soul Qi Bride, Yanggi, Энергия ян, 양기 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 26 chapters |  |  |  |
| chapter dates | PASS | 26 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://susunova.xyz/.../1` to `https://cdn.susunova.xyz/.../s0KJ7A2Y3I29W2IXsfUu4f0MbWdf8IDPYbl7rMfN.jpg <redacted query values: Authorization>` (1 redirects) |  |  |  |
| page load | PASS | `https://susunova.xyz/.../1` (image/jpeg, 172286 bytes, 1280x720) |  |  |  |
