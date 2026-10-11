# Extension Validation Report

- Extension: tachiyomi-ru.yaoilib-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 26
- Lint: 1
- Warnings: 0
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2730544188738947015
- Source name: SlashLib
- Source language: ru
- Selected manga input: popular offset 0: Secret Alliance (`.../23435--secret-alliance`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | Secret Alliance (`.../23435--secret-alliance`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 60 | Somniphobia (`.../178457--somnifobiya`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 15 | Suspicious Police Officer (`.../213547--ayashii-omawari-san`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Gold Beneath the Skin (`.../246555--zoloto-pod-kozei`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Secret Alliance (`.../23435--secret-alliance`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Alliance (`.../23435--secret-alliance`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Alliance, URL=`.../23435--secret-alliance` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 151/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.cdnlibs.org/.../43fbb3f9-fecf-4ea2-990c-66cd3076ae3c.jpg` (image/jpeg, 59325 bytes, 375x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../23435--secret-alliance` |  |  |  |
| details thumbnail URL | PASS | `https://cover.cdnlibs.org/.../43fbb3f9-fecf-4ea2-990c-66cd3076ae3c.jpg` |  |  |  |
| details author | PASS | Lero |  |  |  |
| details artist | PASS | Lero |  |  |  |
| details genres | PASS | Манхва, 16+, Дзёсэй, Драма, Психология, Романтика, Трагедия, Триллер, Школа, Безумие, Антигерой, Преступники / Криминал, Дружба, Месть, Насилие / жестокость, Скрытие личности, Холодное оружие, Шантаж, ГГ женщина, Спортивное тело, Яндере |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Тайный союз<br>★★★★✬ 9.27 (голосов: 49542)<br>Альтернативные названия:<br>Secret Contract / Секретный контракт / Секретный союз / Тайный контракт / シークレット同盟 / 비밀 동맹<br><br>Ын Си Ан, получившая прозвище от подруги Хён И Шаньшань, популярна среди девушек в университете.Было бы неплохо, вступи она на данный путь, но он ей не по душе.Просто так случилось, что у неё боязнь мужчин, а её мать одержима защитой своей дочери от них.Но неожиданно Чхэ Ю Ри, самая красивая девушка универа, признаётся Си Ан в своих чувствах к ней. Теперь Ю Ри не перестаёт крутиться вокруг Си Ан.Всё бы ничего, вот только кажется, Ю Ри хочет заполучить Си Ан всю себе…И кто знает, как низко она падёт ради этого.<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
