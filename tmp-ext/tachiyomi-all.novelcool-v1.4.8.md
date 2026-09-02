# Extension Validation Report

- Extension: tachiyomi-all.novelcool-v1.4.8
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

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 7570101320206504111
- Source name: NovelCool
- Source language: en
- Selected manga input: latest offset 0: I Live In Isekai (`.../I-Live-In-Isekai.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Martial Lord (`.../Martial-Lord.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | MF Ghost (`.../MF-Ghost.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | I Live In Isekai (`.../I-Live-In-Isekai.html`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | The Detective Is Not Working Today: Today Is For You (`.../The-Detective-Is-Not-Working-Today-Today-Is-For-You.html`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | I Live In Isekai Zero : Will The Reincarnated Save The World (`.../I-Live-In-Isekai-Zero-Will-The-Reincarnated-Save-The-World.html`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | I Live In Isekai (`.../I-Live-In-Isekai.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 47 | Chapter 1 (`.../13660610`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 1: title=I Live In Isekai, URL=`.../I-Live-In-Isekai.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.novelcool.com/.../I_Live_In_Isekai9335.png` (image/png, 95366 bytes, 200x281) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../I-Live-In-Isekai.html` |  |  |  |
| details thumbnail URL | PASS | `https://img.novelcool.com/.../I_Live_In_Isekai9335.png` |  |  |  |
| details author | PASS | Tadashi Ken |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ongoing, Action, Martial Arts, Adventure, Drama, Horror, Fantasy, Mystery, Tragedy, Action, Martial Arts, Adventure, Drama, Horror, Fantasy, Mystery, Tragedy, Action, Martial Arts, Adventure, Drama, Horror, Fantasy, Mystery, Tragedy, 2025, Ongoing |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Michi gets into another world without any memory of his past life, now he is just following his new life... and a lots of secrets are being revealed and dark shades are started to cover the life of Michi! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 47 chapters |  |  |  |
| chapter dates | PASS | 47 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://en3.movietop.cc/.../05239b20e585ea1926f18d5c34669d6b.webp <redacted query values: acc and exp>` (image/webp (encoding: lossy), 125586 bytes, 1208x1584) |  |  |  |
