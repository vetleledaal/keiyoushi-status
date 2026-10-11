# Extension Validation Report

- Extension: tachiyomi-all.doujiva-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1868981745168096185
- Source name: Doujiva
- Source language: all
- Selected manga input: popular offset 0: [Sanbalkin] Half Gimai to no Amai Nichijou to Noumitsu Sex 4 [English] (`.../sanbalkin-half-gimai-to-no-amai-nichijou-to-noumitsu-sex-4-english-686534`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | [Sanbalkin] Half Gimai to no Amai Nichijou to Noumitsu Sex 4 [English] (`.../sanbalkin-half-gimai-to-no-amai-nichijou-to-noumitsu-sex-4-english-686534`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | A Night With Loona 3 (`.../a-night-with-loona-3`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | [Kiliu] Nayuta Yuta! [Chinese] [丰川祥子个人汉化] [Digital] (`.../kiliu-nayuta-yuta-chinese-digital-686750`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | [Narukami Hanten (Nagumo Naruse)] Seiyoku o Moteamashita Momoi to Ecchi Suru Hanashi - The sexiest girl in Kivotos | 和性欲无处释放的桃井一起做爱的故事 - 基沃托斯最性感的学生(Blue Archive) [Chinese] [小桃汉化组] [Digital] (`.../narukami-hanten-nagumo-naruse-seiyoku-o-moteamashita-momoi-to-ecchi-suru-hanashi-the-sexiest-girl-in-kivotos-blue-archive-chinese-digital-686536`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Sanbalkin] Half Gimai to no Amai Nichijou to Noumitsu Sex 4 [English] (`.../sanbalkin-half-gimai-to-no-amai-nichijou-to-noumitsu-sex-4-english-686534`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../cmv2iy26xpvq501pb9wy79t31`) |  | <1s |
| pages | `getPageList(chapter)` | success | 90 |  |  | <1s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.doujiva.com/.../cover.webp` (image/webp (encoding: lossy), 27642 bytes, 700x989) |  |  |  |
| details identity | PASS | Details preserved selected URL `sanbalkin-half-gimai-to-no-amai-nichijou-to-noumitsu-sex-4-english-686534` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.doujiva.com/.../cover.webp` |  |  |  |
| details author | PASS | sanbalkin |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | big breasts, cunnilingus, nakadashi, ahegao, x-ray, multi-work series, gyaru, sole female, sole male, original, sweating, kissing, incest, sister, inseki, big ass, ponytail, handjob, fingering, story arc, kimono, onsen |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Pages: 90<br>Language: en<br>Type: MANGA<br>Source: nhentai |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 90 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.doujiva.com/.../001.webp` (image/webp (encoding: lossy), 197330 bytes, 1280x1808) |  |  |  |
