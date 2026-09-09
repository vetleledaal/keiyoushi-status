# Extension Validation Report

- Extension: tachiyomi-ru.mangamen-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 601889634773560665
- Source name: MangaMen
- Source language: ru
- Selected manga input: latest offset 0: Бросивший вызов Падению (`.../the-defiance-of-the-fall`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 60 | Поднятие уровня в одиночку (`.../1344-solo-leveling`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 60 | Становление богом (`.../apotheosis-elevation-to-the-status-of-a-god`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 60 | Бросивший вызов Падению (`.../the-defiance-of-the-fall`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 60 | MF Призрак (`.../mf-ghost`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Бросивший вызов Падению (`.../the-defiance-of-the-fall`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Бросивший вызов Падению (`.../the-defiance-of-the-fall`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 31 | Том 1. Глава 1 (`.../c1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 96 |  |  | 1-10s |

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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Бросивший вызов Падению, URL=`.../the-defiance-of-the-fall` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 241/241 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 241/241 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://zx.mangamen.com/.../3dd1e2c1019ef3269c3a1c6a0457b058.webp` (image/webp (encoding: lossy), 33446 bytes, 333x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-defiance-of-the-fall` |  |  |  |
| details thumbnail URL | PASS | `https://zx.mangamen.com/.../3dd1e2c1019ef3269c3a1c6a0457b058.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Комикс западный, героическое фэнтези, постапокалиптика, сёнэн, фэнтези, Магия, Монстры, Выживание, Волшебные существа, ГГ мужчина, Жестокий мир, Навыки, Разумные расы, Система |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Зак оказывается в самом сердце леса в тот момент, когда мир меняется навсегда. Безжалостная Система вводит всю планету в мультивселенную, где выживает лишь сильнейший.Один, среди смертельно опасных зверей, демонов и куда более жутких тварей, Заку предстоит найти способ выжить, стать сильнее и отыскать пропавшую семью в этой новой, беспощадной реальности.Его единственное оружие — топор.<br>Его единственный выбор — бороться… или погибнуть.<br><br>Альтернативные названия: The Defiance of the Fall<br><br>Статус перевода: Продолжается<br>Дата релиза: 2026<br>Формат: Веб, В цвете<br>Загружено глав: 31<br>Просмотров: 2300 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 31 chapters |  |  |  |
| chapter dates | PASS | 31 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 96 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cloud.mangaimg.ru/.../3c153aa3-5a88-4561-b39a-35ccb1c14e9a.webp` (image/webp (encoding: lossy), 650920 bytes, 800x4103) |  |  |  |
