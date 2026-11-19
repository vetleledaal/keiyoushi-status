# Extension Validation Report

- Extension: tachiyomi-en.manhwa18tx-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: yiimanga
- Source ID: 1509372624702907317
- Source name: Manhwa18TX
- Source language: en
- Selected manga input: popular offset 0: Return of the First Patriarch: The Strongest Reincarnates into His Descendant 1000 Years Later (`.../return-of-the-first-patriarch-the-strongest-reincarnates-into-his-descendant-1000-years-later`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Return of the First Patriarch: The Strongest Reincarnates into His Descendant 1000 Years Later (`.../return-of-the-first-patriarch-the-strongest-reincarnates-into-his-descendant-1000-years-later`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Soul Land IV - The Ultimate Combat (`.../soul-land-iv-the-ultimate-combat`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Return of the First Patriarch: The Strongest Reincarnates into His Descendant 1000 Years Later (`.../return-of-the-first-patriarch-the-strongest-reincarnates-into-his-descendant-1000-years-later`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 66 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwa18tx.com/.../return-of-the-first-patriarch-the-strongest-reincarnates-into-his-descendant-1000-years-later-x350.jpg` (image/jpeg, 28528 bytes, 247x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../return-of-the-first-patriarch-the-strongest-reincarnates-into-his-descendant-1000-years-later` |  |  |  |
| details thumbnail URL | PASS | `https://manhwa18tx.com/.../return-of-the-first-patriarch-the-strongest-reincarnates-into-his-descendant-1000-years-later-x350.jpg` |  |  |  |
| details author | PASS | Miku |  |  |  |
| details artist | PASS | SORAJIMA |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Magical |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Gilphas Eldragon, the founding patriarch of the Eldragon family, dedicated his entire life to the pursuit of absolute strength. In search of eternal combat, he consumed a legendary fruit rumored to grant immortality under the protection of the divine dragon. Yet the rumor was false—Gilphas aged, and in the end, passed away in his son’s arms. Or so it seemed. When he next opened his eyes, Gilphas found himself reborn a thousand years later as Zeke Eldragon, heir to his own bloodline. But the world had changed: the Eldragon clan now thrived under a ruthless creed of survival of the fittest, and a new threat known as the “Chaos” loomed over humanity. Faced with an unfamiliar era and even greater enemies, the ancient warrior feels only exhilaration. For Gilphas—now Zeke—this is the chance he longed for: “This time, I will witness the true end of martial strength!”<br><br>Return of the First Patriarch: The Strongest Reincarnates into His Descendant 1000 Years Later Manhwa, also known as Shodai-sama no Kikan ~Shijou Saikyou ga 1000-nen Go no Shison ni Tensei Suru~ / 初代様の帰還～史上最強が1000年後の子孫に転生する～ / The Return of the First Generation ~The Strongest in History Reincarnates as a Descendant 1000 Years Later~ / Return of the First Patriarch: The Strongest Reincarnates into His Descendant 1000 Years Later / Reincarnates as His Descendant 1000 Years Later / Return of the First Generation: The Strongest in History Reincarnates as His Descendant 1000 Years Later. This Ongoing Manhwa was released in 2024. This series was written by Miku, and illustrated by SORAJIMA. Return of the First Patriarch: The Strongest Reincarnates into His Descendant 1000 Years Later is about Action, Adventure, Fantasy, Magical story.<br><br>Alternative names: Shodai-sama no Kikan ~Shijou Saikyou ga 1000-nen Go no Shison ni Tensei Suru~ / 初代様の帰還～史上最強が1000年後の子孫に転生する～ / The Return of the First Generation ~The Strongest in History Reincarnates as a Descendant 1000 Years Later~ / Return of the First Patriarch: The Strongest Reincarnates into His Descendant 1000 Years Later / Reincarnates as His Descendant 1000 Years Later / Return of the First Generation: The Strongest in History Reincarnates as His Descendant 1000 Years Later |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 66 chapters |  |  |  |
| chapter dates | LINT | 1 of 66 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img02.manhwa18tx.com/.../1-bf760.jpg` (image/jpeg, 605788 bytes, 708x8589) |  |  |  |
