# Extension Validation Report

- Extension: tachiyomi-es.leercapitulo-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5621901596522308538
- Source name: LeerCapitulo
- Source language: es
- Selected manga input: popular offset 0: One Piece (`.../one-piece`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | One Piece (`.../one-piece`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 90 | ¡Por favor, no mueras! (`.../por-favor-no-mueras`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 8 | One Piece (`.../one-piece`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../one-piece`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1275 | Capitulo 0 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 25 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 90 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`.../one-piece` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 122/122 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 122/122 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.leercapitulo.co/.../1067e3fadaf8ec9edd6b71368445a7.jpg <redacted query values: v1794341285814>` (image/jpeg, 45988 bytes, 200x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-piece` |  |  |  |
| details thumbnail URL | PASS | `https://www.leercapitulo.co/.../1067e3fadaf8ec9edd6b71368445a7.jpg <redacted query values: v1794341285814>` |  |  |  |
| details author | PASS | Oda Eiichirou (尾田栄一郎) |  |  |  |
| details artist | PASS | Oda Eiichirou (尾田栄一郎) |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Sci-Fi, Martial Arts, Monsters, Animals |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Hace veintidós años, el legendario pirata, Gold D.<br>Roger fue ejecutado.<br>Sus últimas palabras fueron que su tesoro conocido como "One Piece" estaba escondido en algún lugar dentro del vasto océano conocido como Grand Line.<br>Esto dio inicio a la Era de los Piratas.<br>Ahora, Monkey D.<br>Luffy, un joven que, inspirado por su ídolo de la infancia emprende su viaje buscando el One Piece y convertirse en el Rey de los Piratas.<br><br>Alt name(s): Đảo Hải Tặc · Ван Пис · 海贼王 · ون پیس · 원피스 · वान पीस · วันพีซ · Ван Піс · వన్ పీస్ · Уан Пийс · ون بيس · वन पीस · One Piece. Батпан құйрық · 海賊王 · وان پیس · 海盗路飞 · ワンピース · वान पिस · Ўан Піс · וואן פיס · 航海王 · Ўанпіс · Vua Hải Tặc · Бір бөлік · Уан Пис · قطعة واحدة · ஒன் பீஸ் · Ўан-Піс · ওয়ান পিস · ဝမ်းပိစ် · Budak Getah · One Piece. Большой куш · Wan Pis · One Piece 1184 Espanol · - ワンピース (Japonés) - 원피스 (Coreano) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1275 chapters |  |  |  |
| chapter dates | PASS | 1275 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://es1s11-95168.t34798ndc.com/.../N1-1UFUkQk1ZQNVQ.sdjD.webp` (image/webp (encoding: lossy), 159526 bytes, 798x1150) |  |  |  |
