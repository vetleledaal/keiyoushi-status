# Extension Validation Report

- Extension: tachiyomi-ru.mangapoisk-v1.6.16
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4092015241327675443
- Source name: MangaPoisk
- Source language: ru
- Selected manga input: popular offset 0: Как выжить в академии (`.../how-to-survive-at-the-academy-abs3n8k`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Как выжить в академии (`.../how-to-survive-at-the-academy-abs3n8k`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Жизнь варвара в мире фэнтези (`.../surviving-as-a-barbarian-in-the-fantasy-world`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Токийские Мстители: Письмо от Баджи Кейске (`.../tokyo-revengers-baji-keisuke-kara-no-tegami`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Национальное шоссе №1 (`.../nacionalnoe-shosse-1`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Как выжить в академии (`.../how-to-survive-at-the-academy-abs3n8k`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Как выжить в академии (`.../how-to-survive-at-the-academy-abs3n8k`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 123 | Том 1 Глава 0 (`.../1-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 67 |  |  | <1s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Как выжить в академии, URL=`.../how-to-survive-at-the-academy-abs3n8k` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static2.mangapoisk.me/.../5JrFmFtCPg5VVdWcIjHhRdxhc9rNoMkYIxaanxbm_mini.jpg` (image/jpeg, 32123 bytes, 280x397) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../how-to-survive-at-the-academy-abs3n8k` |  |  |  |
| details thumbnail URL | PASS | `https://static2.mangapoisk.me/.../5JrFmFtCPg5VVdWcIjHhRdxhc9rNoMkYIxaanxbm_mini.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | боевик, приключения, комедия, драма, сёнэн |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | В моей любимой игре мне достался не самый лучший персонаж - скромный побочный злодей. Я не стремлюсь к славе и власти, как это делают другие, и предпочитаю вести размеренную жизнь. Но в этом мире выжить можно только сильным и хитрым. Поэтому я, незаметный злодей, решаю прожить до конца игры, выполнив то, что не удалось главному герою. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 123 chapters |  |  |  |
| chapter dates | LINT | 31 of 123 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=31 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 67 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://static2.mangapoisk.me/.../G5I1XPhKfKx7lBLCmfuEDDZlrznw9bPA6rIn2YyF.png` (image/png, 234682 bytes, 690x1373) |  |  |  |
