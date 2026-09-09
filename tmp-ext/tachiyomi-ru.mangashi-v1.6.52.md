# Extension Validation Report

- Extension: tachiyomi-ru.mangashi-v1.6.52
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 735260312965788798
- Source name: Manga-shi
- Source language: ru
- Selected manga input: popular offset 0: Синяя тюрьма: Блю лок / Blue lock (`.../bluelock`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Синяя тюрьма: Блю лок / Blue lock (`.../bluelock`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Желание дьявола / Devil‘s wish (`.../devils-wish`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Фрилансер (`.../frilanser`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Эфемерный цветок (`.../efemernyy-tsvetok`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Синяя тюрьма: Блю лок / Blue lock (`.../bluelock`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Синяя тюрьма: Блю лок / Blue lock (`.../bluelock`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 365 | Глава 1 (`.../glava-1`) |  | 10s+ |
| pages | `getPageList(chapter)` | success | 71 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Синяя тюрьма: Блю лок / Blue lock, URL=`.../bluelock` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga-shi.org/.../thumb_40_%D1%82%D0%BE%D0%BC_upscayl_4x_digital-art-4x.webp` (image/webp (encoding: lossy), 25866 bytes, 227x304) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../bluelock` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manga-shi.org/.../40_%D1%82%D0%BE%D0%BC_upscayl_4x_digital-art-4x.webp` (image/webp (encoding: lossy), 333030 bytes, 1200x1796) |  |  |  |
| details author | PASS | Kaneshiro Muneyuki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | манга, драма, сёнэн, спорт, футбол |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | По сюжету после проигрыша японской сборной на ЧМ 2018 был разработан специальный проект «Блю Лок» для «создания» лучшего и эгоистичного нападающего. Чтобы выжить в Синей тюрьме, необходимо «пройтись по трупам остальных», ведь вылет означает конец всей футбольной жизни... До конца дойдёт лишь 1 из 300 участников! Это манга про эгоистичный футбол! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 365 chapters |  |  |  |
| chapter dates | PASS | 365 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 71 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manga-shi.org/.../01.png` (image/png, 1088351 bytes, 836x1200) |  |  |  |
