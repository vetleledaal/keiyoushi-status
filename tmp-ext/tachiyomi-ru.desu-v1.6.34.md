# Extension Validation Report

- Extension: tachiyomi-ru.desu-v1.6.34
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
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
- Selected manga input: popular offset 0: In a World Filled With Zombies, I'm the Only One They Won't Attack (`.../3558`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | In a World Filled With Zombies, I'm the Only One They Won't Attack (`.../3558`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | The best metabolite in the world (`.../4524`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | In a World Filled With Zombies, I'm the Only One They Won't Attack (`.../3558`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | The best metabolite in the world (`.../4524`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | In a World Filled With Zombies, I'm the Only One They Won't Attack (`.../3558`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | In a World Filled With Zombies, I'm the Only One They Won't Attack (`.../3558`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 41 | 1. Глава 1 (`.../294859`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 33 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=In a World Filled With Zombies, I'm the Only One They Won't Attack, URL=`.../3558` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.desu.uno/.../3558.jpg <redacted query values: 1734937576>` (image/jpeg, 106741 bytes, 375x525) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../3558` |  |  |  |
| details thumbnail URL | PASS | `https://static.desu.uno/.../3558.jpg <redacted query values: 1734937576>` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Манга, 18+, Экшен, Драма, Постапокалиптика, Приключения, Психологическое, Романтика, Трагедия, Хентай, Веб, В цвете, Супер сила, Зомби, Выживание, Апокалипсис, ГГ мужчина, Жестокий мир, ГГ имба |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | В мире, наполненном зомби, я единственный, на кого они не нападают<br>★★★★✬ 8.56 (голосов: 108)<br>Альтернативные названия:<br>ゾンビのあふれた世界で俺だけが襲われない / Zombie no Afureta Sekai de Ore Dake ga Osowarenai<br><br>Повседневная жизнь Такемуры, меняется в одно мгновение. Не успел он опомниться, как оказался в мире, полном зомби. И по какой-то причине он единственный, на кого не нападают зомби. Помогать людям? Что это? Я буду жить в этом мире так, как я хочу. В постапокалиптическом мире, где цивилизация находится на грани краха, Такемура неожиданно обрел огромную силу. Герой ли он, или единственный, кто живет с тайной, что на него нельзя напасть? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 41 chapters |  |  |  |
| chapter dates | PASS | 41 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img5.desu.uno/.../in_a_world_filled_with_zombies_im_the_only_one_they_wont_attack_vol01_ch001_p001.jpg <redacted query values: 1654761638>` (image/jpeg, 423123 bytes, 1744x2640) |  |  |  |
