# Extension Validation Report

- Extension: tachiyomi-en.mangareadorg-v1.6.56
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2681651342533848540
- Source name: MangaRead.org
- Source language: en
- Selected manga input: popular offset 0: Martial Peak (`.../2344`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Martial Peak (`.../2344`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | The Return of the Disaster-Class Hero (`.../89487`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | The Genius Assassin’s Second Life Begins at the Academy (`.../317181`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Return of the Flowery Mountain Sect (`.../7801`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | Martial Peak (`.../2344`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../2344`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3864 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak, URL=`2344` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 110/110 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 110/110 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.mangaread.org/.../555-175x238.jpg` (image/jpeg, 13748 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `2344` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.mangaread.org/.../555-193x278.jpg` (image/jpeg, 17350 bytes, 193x278) |  |  |  |
| details author | PASS | Momo (II) |  |  |  |
| details artist | PASS | Momo (II) |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Historical, Manhua, Martial Arts |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A brief description of the manhua Martial Peak:<br><br>The path to the heights of martial arts is a long and lonely test. In the face of adversity, you must remain strong and resilient.<br><br>Only then can you overcome all obstacles and become truly strong. Heavenly Tower teaches its students in the most rigorous way how they could survive in the world of martial arts.<br><br>Here the law of the jungle rules and takes into account not quantity, but quality. One genius outshines hundreds of mediocre ones.<br><br>Our main character is Yang Kai, a student of the Heavenly Tower. However, he does not intend to submit to his fate, because he considers – through work and diligence – the way to the top of the martial arts!<br><br>Alternative Names: MP, 武炼巅峰 / Wǔ Liàn Diān Fēng |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3864 chapters |  |  |  |
| chapter dates | PASS | 3864 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.mangaread.org/.../3.jpeg` (image/jpeg, 156964 bytes, 663x373) |  |  |  |
