# Extension Validation Report

- Extension: tachiyomi-ru.desu-v1.6.34
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6684416167758830305
- Source name: Desu
- Source language: ru
- Selected manga input: popular offset 0: The Demon King raising his level with martial prowess (`.../4538`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The Demon King raising his level with martial prowess (`.../4538`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | The Why are you obsessed with your fake wife? (`.../5716`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | The Demon King raising his level with martial prowess (`.../4538`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | The Why are you obsessed with your fake wife? (`.../5716`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | The Demon King raising his level with martial prowess (`.../4538`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Demon King raising his level with martial prowess (`.../4538`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 172 | 1. Глава 1 (`.../359600`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Demon King raising his level with martial prowess, URL=`.../4538` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.desu.uno/.../4538.jpg <redacted query values: 1682275601>` (image/jpeg, 77863 bytes, 375x525) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../4538` |  |  |  |
| details thumbnail URL | PASS | `https://static.desu.uno/.../4538.jpg <redacted query values: 1682275601>` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Манхва, unrated, Экшен, Боевые искусства, Героическое фэнтези, Постапокалиптика, Сёнен, Фэнтези, Веб, В цвете, Демоны, ЛитRPG, Реинкарнация, Монстры, Выживание, Артефакты, Борьба за власть, Владыка демонов, Гильдии, ГГ мужчина, Система |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Король Демонов, поднимающий свой уровень с помощью боевых искусств<br>★★★★☆ 7.88 (голосов: 56)<br>Альтернативные названия:<br>무공으로 레벨업 하는 마왕님 / Король Демонов, поднимающий свой уровень боевыми искусствами / Demon Lord’s Martial Arts Ascension<br><br>«Король Демонов»<br>Так меня звали в прошлой жизни, до того, как я стал человеком... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 172 chapters |  |  |  |
| chapter dates | PASS | 172 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img2.desu.uno/.../demon_king_leveling_up_with_no_gong_vol01_ch001_p001.jpg <redacted query values: 1669739652>` (image/jpeg, 1484188 bytes, 720x16524) |  |  |  |
