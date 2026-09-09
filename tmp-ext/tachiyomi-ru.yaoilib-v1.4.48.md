# Extension Validation Report

- Extension: tachiyomi-ru.yaoilib-v1.4.48
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
- Lint: 3
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2730544188738947015
- Source name: SlashLib
- Source language: ru
- Selected manga input: latest offset 0: A Parallel World With a 1:39 Male to Female Ratio is Unexpectedly Normal (`.../229732--danjohi-139-no-heikou-sekai-wa-omoi-no-hoka-futsuu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 60 | Secret Alliance (`.../23435--secret-alliance`) |  | 10s+ |
| popular_next | `fetchPopularManga(2)` | success | 60 | Somniphobia (`.../178457--somnifobiya`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 15 | A Parallel World With a 1:39 Male to Female Ratio is Unexpectedly Normal (`.../229732--danjohi-139-no-heikou-sekai-wa-omoi-no-hoka-futsuu`) |  | 10s+ |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | Blattodea (`.../23930--burattodea`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | A Parallel World With a 1:39 Male to Female Ratio is Unexpectedly Normal (`.../185644--danjohi-139-no-heikou-sekai-wa-omoi-no-hoka-futsuu`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | A Parallel World With a 1:39 Male to Female Ratio is Unexpectedly Normal (`.../229732--danjohi-139-no-heikou-sekai-wa-omoi-no-hoka-futsuu`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 237 | Том 1. Глава 1 (`.../chapter <redacted query values: , volume, and number>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 3 |  |  | 1-10s |

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
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=A Parallel World With a 1:39 Male to Female Ratio is Unexpectedly Normal, URL=`.../229732--danjohi-139-no-heikou-sekai-wa-omoi-no-hoka-futsuu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Blattodea, URL=`.../23930--burattodea` at page 1 offset 14 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 152/152 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 152/152 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.cdnlibs.org/.../f76a501f-2b32-428b-a092-944301a865af.jpg` (image/jpeg, 64403 bytes, 375x530) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../229732--danjohi-139-no-heikou-sekai-wa-omoi-no-hoka-futsuu` |  |  |  |
| details thumbnail URL | PASS | `https://cover.cdnlibs.org/.../f76a501f-2b32-428b-a092-944301a865af.jpg` |  |  |  |
| details author | PASS | Kisa |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Манга, 18+, Гарем, Комедия, Романтика, Школа, Этти, Исекай, Брат и сестра, ГГ мужчина, Спортивное тело, Яндере, Не слеш |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Параллельный мир с соотношением мужчин и женщин 1:39 оказался неожиданно нормальным (цветная версия)<br>★★★★☆ 8.31 (голосов: 354)<br>Альтернативные названия:<br>男女比1：39の平行世界は思いのほか普通<br><br>Главный герой, Со Сато, внезапно обнаружил, что обменялся телами с альтернативной версией самого себя из параллельной реальности, где соотношение мужчин и женщин составляет 1 к 39. При первом взгляде на этот новый мир, Сато успокоился: "Изменилось лишь соотношение полов, в остальном всё кажется знакомым". Однако внутренний мир женщин этого мира скрывает бесконечное количество тайных желаний.<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 237 chapters |  |  |  |
| chapter dates | PASS | 237 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | FAIL | 2 of 3 pages have invalid URLs: page 2: url=`.../c037f6a4-6ff4-4692-9271-bc19b18a473d.png` (protocol-relative URL), page 3: url=`.../681fad47-fc81-4ad0-9947-71c09b8230a6.png` (protocol-relative URL) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img3.hentaicdn.org/.../e902f00e-aa4c-427c-b2ae-5581d9ab4e4d.png` (image/jpeg, 277219 bytes, 2016x1431) |  |  |  |
